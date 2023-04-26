package org.example.advanced.workshop;

public class WorkshopDemo {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();



        Wheel[] wheels = {wheel1, wheel2, wheel3, wheel4};

        Car car1 = new Car(wheels);

        Workshop workshop = new Workshop(car1);

    }
}
