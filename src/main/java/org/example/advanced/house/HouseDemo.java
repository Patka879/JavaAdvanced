package org.example.advanced.house;

public class HouseDemo {

    public static void main(String[] args) {
        Window window1 = new Window(true);
        Window window2 = new Window(true);
        Window window3 = new Window(true);
        Window window4 = new Window(true);

        Bed bed1 = new Bed(10);
        Bed bed2 = new Bed(2);

        Room room1 = new Room();

        Window[] windows = {window1, window2, window3, window4};

        for (int i = 0; i < windows.length; i++) {
            System.out.println("Window no. " + (i + 1) + " " + windows[i].isWindowOpen());
        }
    }

}
