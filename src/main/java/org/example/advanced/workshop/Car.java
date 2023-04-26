package org.example.advanced.workshop;

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
        wheel[flatTireIndex].setPierced(true);
        wheel[flatTireIndex].setPressure(10);
    }
}
