package com.c4c.oyfy.app.illust;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class BooksCreationDto {
    private List<Book> books = new ArrayList<>();

   //default and parameterized constructor

    public void addBook(Book book) {
        this.books.add(book);
    }

   //getter and setter
}