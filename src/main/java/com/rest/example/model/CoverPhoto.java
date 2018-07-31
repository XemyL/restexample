package com.rest.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoverPhoto {
    @JsonProperty("ID")
    private Integer id;

    @JsonProperty("IDBook")
    private Integer idBook;

    @JsonProperty("Url")
    private String url;

}
