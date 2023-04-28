package org.example.advanced.exceptions.introductionToExceptions;

import java.util.Scanner;

/**
 * Create scanner. ask for number. Ig number is not number throw exception and ask again to type number
 */
public class Exceptions2 {
    public static void main(String[] args) {
        int value = readNumber();
        System.out.println("result is: " + value);
    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (true) {
            try {
                System.out.println("Please enter number");
                number = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("It was not a number, please provide a number");
                scanner.nextLine();
            }
        }

        return number;
    }
}
