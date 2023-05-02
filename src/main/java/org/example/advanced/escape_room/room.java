package org.example.advanced.escape_room;

import java.util.ArrayList;
import java.util.Scanner;

public class room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList items = new ArrayList<>();
        items.add("KEY");
        items.add("WINDOW");
        items.add("DOOR");
        boolean isOpen = false;
        boolean isKeyTaken = false;

        System.out.println("You have to escape from the room. Here are items that You can use:");
        for (Object item : items) {
            System.out.println("====" + item + "====");
        }

        while(true) {

            System.out.println("Which Item Do You Want To Use?");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("key")
                || item.equalsIgnoreCase("window")
                || item.equalsIgnoreCase("door")) {
                    if (item.equalsIgnoreCase("window")) {
                        isOpen = !isOpen;
                        if (isOpen) {
                            System.out.println("Window is now open");
                        } else {
                            System.out.println("Window is now closed");
                        }
                    } else if (item.equalsIgnoreCase("key")) {
                        isKeyTaken = !isKeyTaken;
                        if (isKeyTaken) {
                            System.out.println("You took the key");
                            items.remove("key");
                        } else {
                            System.out.println("You returned the key");
                            items.add("key");
                        }
                    } else if (item.equalsIgnoreCase("door")) {
                        if (isKeyTaken) {
                            System.out.println("Congratulations! You Escaped from the room!");
                            break;
                        } else {
                            System.out.println("It looks like You don't have a key...");
                        }
                    }
            } else {
                System.out.println("This item does not exist. Enter correct item");
            }
        }
    }
}
