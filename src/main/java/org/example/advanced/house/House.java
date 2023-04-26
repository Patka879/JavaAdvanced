package org.example.advanced.house;

import java.util.Arrays;

public class House {
    private Room[] rooms;

    public House(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "House: " + "\n" +
                "Rooms:" + Arrays.toString(rooms) + "\n";
    }
}
