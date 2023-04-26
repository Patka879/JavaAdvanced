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

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public int getMileageForReview() {
        return mileageForReview;
    }

    public void setMileageForReview(int mileageForReview) {
        this.mileageForReview = mileageForReview;
    }

    public void DisplayCarDetails() {
        System.out.println("Brand" + brand);
        System.out.println("Mileage: " + mileage + " km");
    }

    public int DistanceToBeAddedToMileage(int distance) {
        return mileage += distance;
    }

    public int WhenInspectionIsNeeded() {
        return mileageForReview - mileage;
    }
}
