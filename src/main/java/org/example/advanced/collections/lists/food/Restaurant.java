package org.example.advanced.collections.lists.food;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    private ArrayList<Dish> dishes;

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }

    public Restaurant(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }

    public void findDish() throws RestaurantException {
        System.out.println("What dish are You looking for?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Dish dish : dishes) {
            if (dish.getName().equalsIgnoreCase(name)) {
                System.out.println(dish);
            } else {
                throw new RestaurantException("No dish found with name: " + name);
            }
        }

    }




}
