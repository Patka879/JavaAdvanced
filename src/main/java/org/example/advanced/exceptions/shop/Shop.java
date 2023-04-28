package org.example.advanced.exceptions.shop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    private static final String FILE_PATH = "products.csv";
    private List<Product> products = new ArrayList<>();

    public void loadProducts() throws FileNotFoundException,ProductCreationException {
        File file = new File(FILE_PATH);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            Product product = parseLineAndCreateProduct(line);
            products.add(product);
        }
    }

    private Product parseLineAndCreateProduct(String line) throws ProductCreationException {
        String[] elements = line.split(";");
        String name = elements[0];
        try {
            double price = Double.parseDouble(elements[1]);
            int quantity = Integer.parseInt(elements[2]);
            if (price < 0 || quantity < 0) {
                throw new ProductCreationException("negative value", line);
            }
            return new Product(name, quantity, price);
        }catch (NumberFormatException e){
            throw new ProductCreationException("please change text to number", line);
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}