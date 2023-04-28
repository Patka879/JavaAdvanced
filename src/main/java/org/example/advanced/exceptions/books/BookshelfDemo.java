package org.example.advanced.exceptions.books;

import java.io.FileNotFoundException;

public class BookshelfDemo {
    public static void main(String[] args) {
        System.out.println("Books about programming:");
        Bookshelf bookshelf = new Bookshelf();
        try {
            bookshelf.loadBooks();
            System.out.println(bookshelf.getBooks());
        } catch (FileNotFoundException e) {
            System.out.println("No book list found. You should start reading!");
        }
    }
}
