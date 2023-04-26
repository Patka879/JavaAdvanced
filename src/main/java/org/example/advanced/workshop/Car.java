package org.example.advanced.workshop;

import java.util.Arrays;
import java.util.Random;

public class Car {
    private Wheel[] wheel;

    public Car(Wheel[] wheel) {
        this.wheel = wheel;
    }

    public Wheel[] getWheel() {
        return wheel;
    }

    public void setWheel(Wheel[] wheel) {
        this.wheel = wheel;
    }

    public void flatTire() {
        Random random = new Random();
        int flatTireIndex = random.nextInt(1, 4);
        int numberOfFlatTires = random.nextInt(1, 4);
        for (int i = 0; i < numberOfFlatTires; i++) {
            wheel[flatTireIndex].setPierced(true);
            wheel[flatTireIndex].setPressure(10);
        }
    }

    @Override
    public String toString() {
        return "Car wheels: " +
                "wheel=" + Arrays.toString(wheel);
    }
}
