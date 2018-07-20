package com.rest.example;

import com.rest.example.model.Author;
import com.rest.example.model.Book;
import com.rest.example.services.AuthorService;
import com.rest.example.services.BookService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest
{
    private static BookService bookService;
    private static AuthorService authorService;

    @BeforeClass
    public static void init(){
        bookService = new BookService();
        authorService = new AuthorService();
    }

    @Test
    public void validateBooksCount()
    {
        Book[] books = bookService.getAllBooks();
        Assert.assertEquals(200, books.length);
    }

    @Test
    public void validateAuthorsCount()
    {
        Author[] authors = authorService.getAllAuthors();
        Assert.assertEquals(200, authors.length);
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
        bookService.postNewBook(newBook);
    }
}
