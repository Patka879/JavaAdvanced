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

    public void displayCarDetails() {
        System.out.println("Brand" + brand);
        System.out.println("Mileage: " + mileage + " km");
    }

    public int distanceToBeAddedToMileage(int distance) {
        return mileage += distance;
    }

    public int whenInspectionIsNeeded() {
        return mileageForReview - mileage;
    }
}
