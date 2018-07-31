package com.rest.example;

public interface Endpoints {
    String BASE_URI = "https://fakerestapi.azurewebsites.net/api";

    String ALL_AUTHORS = "/Authors";
    String AUTHOR_BY_ID = "/Authors/{id}";

    String ALL_BOOKS = "/Books";
    String BOOK_BY_ID = "/Books/{id}";

    String ALL_COVER_PHOTOS = "/CoverPhotos";
    String COVER_PHOTO_BY_ID = "/CoverPhotos/{id}";
}
