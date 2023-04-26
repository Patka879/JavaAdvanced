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
