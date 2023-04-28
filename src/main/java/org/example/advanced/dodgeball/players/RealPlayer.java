package org.example.advanced.dodgeball.players;

import java.util.Scanner;

public class RealPlayer extends Player {

    private boolean isAlive;
    public RealPlayer(String name) {
        super( name);
        isAlive = true;
    }

    @Override
    public void makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter direction (W/A/S/D): ");
        char direction = scanner.next().charAt(0);
        int newHorizontalPosition = horizontalPosition;
        int newVerticalPosition = verticalPosition;
        switch (direction) {
            case 0:
                newHorizontalPosition--;
                break;
            case 1:
                newHorizontalPosition++;
                break;
            case 2:
                newVerticalPosition--;
                break;
            case 3:
                newVerticalPosition++;
                break;
        }
        horizontalPosition = newHorizontalPosition;
        newVerticalPosition = newVerticalPosition;
    }

    @Override
    public String toString() {
        return "YOU " + "\n" +
                "Name: " + name + ", Position: " + verticalPosition + "." + horizontalPosition;
    }
}
