/**
 * Prepare a program in which you will simulate a situation when a car driver catches a flat tire and takes it
 * to the workshop for repair.
 * - In main prepare four Wheel objects, pressure of each of them must be set to default value, and they are
 *   not pierced,
 * - Collect all the wheels into an array and pass it to the Car object,
 * - Simulate the event that the car gets a flat tire in a random wheel,
 * - A Workshop object can accept a car for repair,
 * - The repair is that the workshop finds which wheel from the car is broken and fixes it,
 * - At the end of the repair, the workshop returns an object of the Receipt type containing the type of service,
 *   how many times it was performed and the total price.
 */

package org.example.advanced.workshop;

public class Workshop {
    private Car car;

    public Workshop(Car car) {
        this.car = car;
    }

    public void repairCar() {
        int repairedWheels = 0;
        int oneTireFixPrice = 30;
        for (int i = 0; i < 4; i++) {
           if(car.getWheel()[i].getPressure() < 30 || car.getWheel()[i].isPierced() == true) {
               car.getWheel()[i].setPressure(30);
               car.getWheel()[i].setPierced(false);
               System.out.println("Wheel " + (i + 1) + " has been repaired");
               repairedWheels++;
           }
        }
        if (repairedWheels < 1) {
            System.out.println("Your receipt is " + oneTireFixPrice + " $");
        } else {
            System.out.println("Your receipt is " + (oneTireFixPrice * repairedWheels) + " $");
        }
    }
}
