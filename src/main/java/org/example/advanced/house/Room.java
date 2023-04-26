package org.example.advanced.house;

public class Room extends House {
    private Window[] windows;
    private Bed bed;

    public Room(Bed bed, Window[] windows) {
        this.bed = bed;
        this.windows = windows;
    }
}
