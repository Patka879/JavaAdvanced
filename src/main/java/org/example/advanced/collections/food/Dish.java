package org.example.advanced.collections.food;

public class Dish {
    private String name;
    private int price;
    private int calorificValue;

    private Type type;

    public Dish(String name, int price, int calorificValue, Type type) {
        this.name = name;
        this.price = price;
        this.calorificValue = calorificValue;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DISH: " + "\n" + "Name: " + name + "\n" + "Price: " + price + "\n" +  "Calorific Value: " +
                calorificValue + "\n" + "Type: " + type;
    }
}
