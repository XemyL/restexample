package com.rest.example.steps;

import com.rest.example.model.Book;
import com.rest.example.services.BookService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import org.joda.time.LocalDate;
import org.junit.Assert;

import java.util.Date;
import java.util.List;

public class ServicesSteps{

    private BookService bookService;
    private Response response;

    @Given("Service of books is available")
    public void serviceOfBooksIsAvailable(){
        bookService = new BookService();
    }

    @When("Get count of books")
    public void getCountOfBooks(){
        int count = bookService.getAllBooks().length;
        Serenity.getCurrentSession().put("count", count);
    }

    @Then("Count of books should be (-?\\d+)")
    public void validateCountOfBooks(int count){
        int expectedValue = (Integer) (Serenity.getCurrentSession().get("count"));
        Assert.assertEquals(count, expectedValue);
    }

    @Then("Count of books should not be (-?\\d+)")
    public void validateNegativeCountOfBooks(int count){
        int expectedValue = (Integer) (Serenity.getCurrentSession().get("count"));
        Assert.assertNotEquals(count, expectedValue);
    }

    @Then("Count of books should not be")
    public void validateNegativeCountOfBooks(List<Integer> countsList){
        int expectedValue = (Integer) (Serenity.getCurrentSession().get("count"));
        for (int count: countsList)
            Assert.assertNotEquals(count, expectedValue);
    }

    @When("User add new book with id = (\\d+), title = (.+), description = (.+), excerpt = (.+)")
    public void addNewBook(Integer id, String title, String description, String excerpt){
        Book newBook = new Book();

        newBook.setID(id);
        newBook.setTitle(title);
        newBook.setDescription(description);
        newBook.setExcerpt(excerpt);
        response = bookService.postNewBook(newBook);
    }

    @Then("Response code should be (\\d+)")
    public void verifyResponseCode(int statusCode){
        Assert.assertEquals(statusCode, response.statusCode());
    }
}
