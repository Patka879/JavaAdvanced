package org.example.advanced.collections.lists.food;
/**
 * 22. Execute the following commands:
 * Create a collection of food names and complete with 5 dishes.
 * Try adding a dish that is already in the set
 * Try to display the first dish in the set - is it possible?
 * Iterate through all the elements of the set, displaying the dishes in capital letters.
 */

import java.util.ArrayList;

public class RestaurantDemo {
    public static void main(String[] args) {


        ArrayList<Dish> dishes = new ArrayList<>();
        Restaurant restaurant = new Restaurant(dishes);

        restaurant.addDish(new Dish("pizza", 30, 500, Type.LUNCH));
        restaurant.addDish(new Dish("pasta", 40, 300, Type.DINNER));
        restaurant.addDish(new Dish("Scrambled eggs", 10, 200, Type.BREAKFAST));
        restaurant.addDish(new Dish("Sushi", 100, 300, Type.BRUNCH));

        restaurant.findDish();
    }
}
