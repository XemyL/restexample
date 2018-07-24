package com.rest.example;

import com.rest.example.model.Author;
import com.rest.example.model.Book;
import com.rest.example.services.AuthorService;
import com.rest.example.services.BookService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest
{
    private static BookService bookService;
    private static AuthorService authorService;

    @DataProvider(name = "booksCount")
    public static Object[][] booksCount() {
        return new Object[][] {
            { 1, false },
            { 2, false },
            {200, true},
            {1000, false},
            {-1, false}
        };
    }

    @DataProvider(name = "authorsCount")
    public static Object[][] authorsCount() {
        return new Object[][] {
                { 1, false },
                { 2, false },
                {1000, false},
                {-1, false}
        };
    }

    @BeforeClass
    public static void init(){
        bookService = new BookService();
        authorService = new AuthorService();
    }

    @Test(dataProvider = "booksCount")
    public void validateBooksCount(int count, boolean flag)
    {
        Book[] books = bookService.getAllBooks();
        Assert.assertEquals(books.length==count, flag);
    }


    @Test(dataProvider = "authorsCount")
    public void validateAuthorsCount(int count, boolean flag)
    {
        Author[] authors = authorService.getAllAuthors();
        Assert.assertEquals(authors.length==count, flag);
    }

    @Test
    public void validateAddBook()
    {
        Book newBook = new Book();
        Book[] books = bookService.getAllBooks();

        Integer id = books[books.length-1].getID() + 1;
        newBook.setID(id);
        newBook.setTitle("test title");
        newBook.setDescription("test desc");
        newBook.setExcerpt("test exc");
        assert bookService.postNewBook(newBook).statusCode()==200;

    }
}
