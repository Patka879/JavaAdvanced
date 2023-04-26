package org.example.advanced.house;

public class Room extends House {
    private Window[] windows;
    private Bed bed;

    public Room() {
        this.bed = new Bed(5); // Create a Bed object with 5 days since last change
        this.windows = new Window[2]; // Create an array of 2 windows
        for (int i = 0; i < 2; i++) {
            windows[i] = new Window(true); // Initialize each window object
        }
    }
}
