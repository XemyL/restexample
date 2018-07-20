package com.rest.example.model;


import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "IDBook",
        "FirstName",
        "LastName"
})
public class Author {

    @JsonProperty("ID")
    private Integer iD;
    @JsonProperty("IDBook")
    private Integer iDBook;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("ID")
    public Integer getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(Integer iD) {
        this.iD = iD;
    }

    @JsonProperty("IDBook")
    public Integer getIDBook() {
        return iDBook;
    }

    @JsonProperty("IDBook")
    public void setIDBook(Integer iDBook) {
        this.iDBook = iDBook;
    }

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}