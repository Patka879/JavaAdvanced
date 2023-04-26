package org.example.advanced.car;

public class CarDemo {

    public static void main(String[] args) {


    Car car1 = new Car("Volkswagen", 283, 20000);
    Car car2 = new Car("Mercedes", 3332, 40000);
    Car car3 = new Car("BMW", 23333); // second constructor
    Car car4 = new Car("Toyota"); // third constructor


        System.out.println("Car 1:");
        car1.displayCarDetails();

        System.out.println("Car 2:");
        car2.displayCarDetails();

        car1.distanceToBeAddedToMileage(2435);
        System.out.println("Car 1 after driving for 2435km");
        car1.displayCarDetails();

        System.out.println("How many miles are left for inspection of Car 1?");
        System.out.println("In " + car1.whenInspectionIsNeeded());

        System.out.println("Car info with second constructor:");
        car3.displayCarDetails();

        System.out.println("Car info with third constructor:");
        car4.displayCarDetails();
    }
}
