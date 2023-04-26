package org.example.advanced.house;

import java.sql.SQLOutput;

public class HouseDemo {

    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window(true);
        Window window3 = new Window();
        Window window4 = new Window(true);

        Bed bed1 = new Bed(10);
        Bed bed2 = new Bed(2);

        Window[] windows = {window1, window2};
        Window[] windows1 = {window1, window2, window3, window4};

        Room room1 = new Room(bed1, windows);
        Room room2 = new Room(bed2, windows1);

        Room[] rooms = {room1, room2};

        House house = new House(rooms);

        for (int i = 0; i < windows.length; i++) {
            System.out.println("Window no. " + (i + 1) + " " + windows[i].isWindowOpen());
        }

        System.out.println(room1);
        System.out.println("============================");

        System.out.println("============================");
        System.out.println("Cleaned room:");
        room1.cleanRoom();
        System.out.println(room1);

        System.out.println("=============================");
        System.out.println(house);
    }

}
