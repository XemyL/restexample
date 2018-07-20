package com.rest.example.services;


import com.rest.example.Endpoints;
import com.rest.example.model.Book;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class BookService {

    static {
        RestAssured.baseURI = Endpoints.BASE_URI;
    }

    private RequestSpecification httpRequest = RestAssured.given();

    public Book[] getAllBooks(){
        Response response = httpRequest.get(Endpoints.ALL_BOOKS);
        return response.as(Book[].class);
    }

    public Book getBookById(Integer id){
        Response response = httpRequest.request(Method.GET, Endpoints.BOOK_BY_ID, id);
        return response.as(Book.class);
    }

    public Response postNewBook(Book book){
        httpRequest.body(book);
        Response response = httpRequest.post(Endpoints.ALL_BOOKS);

        return response;
    }
}
