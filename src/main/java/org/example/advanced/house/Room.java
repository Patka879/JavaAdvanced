package org.example.advanced.house;

public class Room extends House {
    private Window[] windows;
    private Bed bed;

    public Room() {
        this.bed = new Bed(5);
        this.windows = new Window[2];
        for (int i = 0; i < 2; i++) {
            windows[i] = new Window(true);
        }
    }
}
