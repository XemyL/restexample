package com.rest.example.services;


import com.rest.example.Endpoints;
import com.rest.example.model.Author;
import com.rest.example.model.Book;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthorService {

    static {
        RestAssured.baseURI = Endpoints.BASE_URI;
    }

    private RequestSpecification httpRequest = RestAssured.given();


    public Author[] getAllAuthors(){
        Response response = httpRequest.request(Method.GET, Endpoints.ALL_AUTHORS);

        return response.as(Author[].class);
    }

    public Author getAuthorById(Integer id){
        Response response = httpRequest.request(Method.GET, Endpoints.AUTHOR_BY_ID, id);

        return response.as(Author.class);
    }
}
