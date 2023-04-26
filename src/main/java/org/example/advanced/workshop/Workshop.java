package org.example.advanced.workshop;

public class Workshop {
    private Car car;

    public Workshop(Car car) {
        this.car = car;
    }

    public String repairCar() {
        int fixedWheel = 0;
        for (int i = 0; i < 4; i++) {
           if(car.getWheel()[i].getPressure() < 30 || car.getWheel()[i].isPierced() == true) {
               car.getWheel()[i].setPressure(30);
               car.getWheel()[i].setPierced(false);
               fixedWheel = i;
           }
        }
        return "Wheel " + fixedWheel + " has been fixed";
    }
}
