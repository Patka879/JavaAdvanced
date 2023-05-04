package org.example.advanced.classes;
// there can be only one public class in the file
public class PublicClass {
    public static void main(String[] args) {
        PackageClass packageClass = new PackageClass(); //local variable
        InnerClass innerClass = new InnerClass(); // local variable
        class LocalClass {
            // class declared in method and with method scope
        }
        LocalClass localClass = new LocalClass();
        // we can access LocalClass only after declaration of this class

        // Anonymous classes:
        // We don't need to make all this code to change one line of code and create new class just for product
        // that is not for sale.
        Product product = new Product("forSale");
        Product product1 = new Product("Not for sale") {
            // automatically inherits Product class. We are not in a public method anymore


            @Override
            public void show() {
                    System.out.println("This is a product with name " + name);
                    System.out.println("This product is not for sale");
            }
        };
        ProductNotForSale productNotForSale = new ProductNotForSale("notForSale");

        product.show();
        productNotForSale.show();
        product1.show();
    }
    static class InnerClass {
        // every access type is valid here
        // can be static or not-static
    }
}

class PackageClass {  //

}

class Product {

    String name;

    public Product(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("This is a product with name " + name);
        System.out.println("You can buy this product");
    }
}
