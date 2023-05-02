package org.example.advanced.escape_room;

import java.util.ArrayList;
import java.util.Scanner;

public class room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList items = new ArrayList<>();
        items.add("key");
        items.add("window");
        items.add("door");
        boolean isOpen = false;
        boolean isKeyTaken = false;

        while(true) {

            System.out.println("Which Item Do You Want To Use?");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("key")
                || item.equalsIgnoreCase("window")
                || item.equalsIgnoreCase("door")) {
                    if (item.equalsIgnoreCase("window")) {
                        isOpen = !isOpen;
                        if (isOpen) {
                            System.out.println("Window is open");
                        } else {
                            System.out.println("Window is closed");
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
                            System.out.println("Congratulations! You Escaped");
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
