/**
 * 1. Create a class of type Car and CarDemo with the main method. In the main method create two car objects. Objects of type Car must have the following characteristics: brand, mileage and mileage for review, the last one supplemented with a value, e.g. 20,000 km. In the main method, give values ​​for the features of the previously created cars.
 *
 * For objects type Car prepare the following behaviors and test them in the main method:
 * - create a method that displays the car brand and mileage,
 * - create a method that takes the distance to be driven and increases the car's mileage by that distance,
 * - create a method that returns the number of kilometers after which you will need to perform the inspection (taking into account the current mileage).
 *
 * more difficult variant: create an array of cars in main and then, using a loop, display the data of each of them.
 */

package org.example.advanced.car;

public class Car {
    private String brand;
    private int mileage;
    private int mileageForReview;

    public Car(String brand, int mileage, int mileageForReview) {
        this.brand = brand;
        this.mileage = mileage;
        this.mileageForReview = mileageForReview;
    }

    // Manually written constructor

    public Car(String brand, int mileageForReview) {
        this.brand = brand;
        this.mileageForReview = mileageForReview;
    }

    // Automatically generated

    public Car(String brand){
        this.brand = brand;
    }

    public void displayCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Mileage: " + mileage + " km");
    }

    // Automatically generated getters and setters


    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public int getMileageForReview() {
        return mileageForReview;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setMileageForReview(int mileageForReview) {
        this.mileageForReview = mileageForReview;
    }

    public int distanceToBeAddedToMileage(int distance) {
        return mileage += distance;
    }

    public int whenInspectionIsNeeded() {
        return mileageForReview - mileage;
    }

    @Override
    public String toString() {
        return "Car brand: " + brand +
                " Mileage: " + mileage +
                " MileageForReview" + mileageForReview;
    }
}
