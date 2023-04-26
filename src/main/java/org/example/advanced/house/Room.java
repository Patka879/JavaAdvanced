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
        StringBuilder windowsDisplay = new StringBuilder("\n");
        for (Window window : windows) {
            windowsDisplay.append(window).append("\n");

        }
        return "Room details: \n Windows:" + windowsDisplay + "\n" + "Beds: " + "\n" + bed;
    }
}
