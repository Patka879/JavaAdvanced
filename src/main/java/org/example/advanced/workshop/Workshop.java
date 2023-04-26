package org.example.advanced.workshop;

public class Workshop {
    private Car car;

    public Workshop(Car car) {
        this.car = car;
    }

    public void repairCar() {
        for (int i = 0; i < 4; i++) {
           if(car.getWheel()[i].getPressure() < 30 || car.getWheel()[i].isPierced() == true) {
               car.getWheel()[i].setPressure(30);
               car.getWheel()[i].setPierced(false);
               System.out.println("Wheel " + (i + 1) + " has been repaired");
           }
        }
    }
}
