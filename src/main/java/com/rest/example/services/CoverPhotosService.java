package com.rest.example.services;

import com.rest.example.Endpoints;
import com.rest.example.model.CoverPhoto;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CoverPhotosService {
    static {
        RestAssured.baseURI = Endpoints.BASE_URI;
    }

    private RequestSpecification httpRequest = RestAssured.given();

    public CoverPhoto[] getAllCoverPhotos(){
        Response response = httpRequest.get(Endpoints.ALL_BOOKS);
        return response.as(CoverPhoto[].class);
    }
}
