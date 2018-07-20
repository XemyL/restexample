package com.rest.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by xemyl on 7/19/18.
 */
public class Book {

    @JsonProperty("ID")
    private Integer iD;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("PageCount")
    private Integer pageCount;
    @JsonProperty("Excerpt")
    private String excerpt;
    @JsonProperty("PublishDate")
    private String publishDate;

    @JsonProperty("ID")
    public Integer getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(Integer iD) {
        this.iD = iD;
    }

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("PageCount")
    public Integer getPageCount() {
        return pageCount;
    }

    @JsonProperty("PageCount")
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    @JsonProperty("Excerpt")
    public String getExcerpt() {
        return excerpt;
    }

    @JsonProperty("Excerpt")
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    @JsonProperty("PublishDate")
    public String getPublishDate() {
        return publishDate;
    }

    @JsonProperty("PublishDate")
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }


}