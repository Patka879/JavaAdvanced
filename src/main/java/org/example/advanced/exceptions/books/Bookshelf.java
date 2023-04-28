package org.example.advanced.exceptions.books;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bookshelf {
    private static final String FILE_PATH = "org.example.advanced.exceptions.books.books.txt";
    private List<String> books = new ArrayList<>();

    public void loadBooks() throws FileNotFoundException {
        File file = new File(FILE_PATH);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String book = scanner.nextLine();
            books.add(book);
        }
    }

    public List<String> getBooks() {
        return books;
    }
}
