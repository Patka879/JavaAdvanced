package org.example.advanced.exceptions.introductionToExceptions;

import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args) {
        // Wrong input exception
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        try {
            int num = scanner.nextInt();
            System.out.println("Your number: " + num);
        } catch (Exception e) {
            System.out.println("Letters provided, cannot be converted to int");
        }
    }
}
