package org.example.advanced.exceptions.books;

import org.example.advanced.exceptions.shop.Product;
import org.example.advanced.exceptions.shop.ProductCreationException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bookshelf {
    private static final String FILE_PATH = "books.txt";
    private List<Book> books = new ArrayList<>();

    public void loadBooks() throws FileNotFoundException {
        File file = new File(FILE_PATH);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String book = scanner.nextLine();
            System.out.println("- " + book);
        }
    }
}
