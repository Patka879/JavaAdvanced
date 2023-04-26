package org.example.advanced.house;

import java.util.Arrays;

public class Room{
    private Window[] windows;
    private Bed bed;

    public Room(Bed bed, Window[] windows) {
        this.bed = bed;
        this.windows = windows;
    }

    public void cleanRoom() {
        bed.daysSinceBeddingWasChanged = 0;
        for (int i = 0; i < windows.length; i++) {
            windows[i].setCanOpen(true);
        }
    }

    @Override
    public String toString() {
        return "Room details: " + "\n" + "Windows:" + Arrays.toString(windows) + "\n" + "Beds: " + "\n" + bed;
    }
}
