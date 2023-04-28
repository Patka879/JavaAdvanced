package org.example.advanced.exceptions.books;

import java.io.FileNotFoundException;

public class BookshelfDemo {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        try {
            bookshelf.loadBooks();
        } catch (FileNotFoundException e) {
            System.out.println("No book list found. You should start reading!");
        }
    }
}
