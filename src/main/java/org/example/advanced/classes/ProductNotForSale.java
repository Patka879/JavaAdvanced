package org.example.advanced.classes;

public class ProductNotForSale extends Product{
    public ProductNotForSale(String name) {
        super(name);
        this.name = name;
    }

    public void show() {
        System.out.println("This is a product with name " + name);
        System.out.println("This product is not for sale");
    }
}
