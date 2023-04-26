package org.example.advanced.workshop;

public class WorkshopDemo {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();;
        Wheel[] wheels = {wheel1, wheel2, wheel3, wheel4};

        Car car1 = new Car(wheels);
        Workshop workshop = new Workshop(car1);

        System.out.println(car1); // car with all wheels working
        car1.flatTire();          // giving a flat tire to random wheel or more than one
        workshop.repairCar();     // repairing wheels
        System.out.println(car1); // checking if all wheels are now fixed
    }
}
