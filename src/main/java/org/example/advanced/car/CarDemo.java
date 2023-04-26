package org.example.advanced.car;

public class CarDemo {

    public static void main(String[] args) {


    Car car1 = new Car("Volkswagen", 283, 20000);
    Car car2 = new Car("Mercedes", 3332, 40000);

        System.out.println("Car 1:");
        car1.displayCarDetails();

        System.out.println("Car 2:");
        car2.displayCarDetails();

        car1.distanceToBeAddedToMileage(2435);
        System.out.println("Car 1 after driving for 2435km");
        car1.displayCarDetails();

        System.out.println("How many miles are left for inspection of Car 1?");
        System.out.println("In " + car1.whenInspectionIsNeeded());

    }
}
