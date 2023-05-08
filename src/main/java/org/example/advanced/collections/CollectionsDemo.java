package org.example.advanced.collections;

import java.sql.SQLOutput;
import java.util.*;

/**
 * COLLECTIONS TYPE:
 * -- MAPS
 * -- SETS
 * -- QUEUES
 * -- LISTS
 * -- DEQUEUES
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        /**
         * SETS:
         * --- there are no duplicates and order is always the same
         * --- order is different than in list
         */

        Set<String> names = new HashSet<>();
        names.add("Iza");
        names.add("Adam");
        names.add("Ada");
        names.add("Daniel");
        names.add("Przemek");

        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }

        // Objects are stored in different places in memory, so it is not a duplicate
        // it just checks "==" the only way to check values is to override equals with different method
        Set<Product> products = new HashSet<>();

        Product bread = new Product("BREAD");
        products.add(new Product("MILK"));
        products.add(new Product("SODA"));
        products.add(new Product("PASTA"));
        products.add(new Product("SODA"));
        products.add(bread);
        products.add(bread);


        // We want to check by values, not references, so we have to override equals. We have to ovveride both
        // equals and hashCode method. They come together.
        // HashCodes are taking care of performance.
        // SETS ARE PERFORMING BETTER THAN LISTS. USE LISTS IF YOU CAN.



        System.out.println(products);

    }

}

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
