package org.example.advanced.workshop;

import java.util.Random;

public class Car {
    private Wheel[] wheels;

    public Car(Wheel[] wheel) {
        this.wheels = wheel;
    }

    public Wheel[] getWheel() {
        return wheels;
    }

    public void setWheel(Wheel[] wheel) {
        this.wheels = wheel;
    }

    public void flatTire() {
        Random random = new Random();
        int numberOfFlatTires = random.nextInt(1, 4);
        for (int i = 0; i < numberOfFlatTires; i++) {
            int flatTireIndex = random.nextInt(1, 4);
            wheels[flatTireIndex].setPierced(true);
            wheels[flatTireIndex].setPressure(10);
            System.out.println("Wheel " + (i + 1) +" is flat");
        }
    }

    @Override
    public String toString() {
        StringBuilder wheelsDisplay = new StringBuilder("\n");
        for (Wheel wheel : wheels) {
            wheelsDisplay.append(wheel).append("\n");
        }
        return "Car wheels statistics: " + wheelsDisplay;
    }
}
