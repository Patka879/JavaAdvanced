package org.example.advanced.workshop;

public class Wheel {
    private int pressure;
    private boolean pierced;

    public Wheel() {
        this.pressure = 30;
        this.pierced = false;
    }

    public Wheel(int pressure, boolean pierced) {
        this.pressure = pressure;
        this.pierced = pierced;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setPierced(boolean pierced) {
        this.pierced = pierced;
    }

    public int getPressure() {
        return pressure;
    }

    public boolean isPierced() {
        return pierced;
    }

    @Override
    public String toString() {
        return "Wheel pressure is " + pressure + " is " + (pierced ? "pierced" : "not pierced");
    }
}
