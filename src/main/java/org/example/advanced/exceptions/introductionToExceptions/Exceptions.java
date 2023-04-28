package org.example.advanced.exceptions.introductionToExceptions;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            int value = 10/1;
            System.out.println(value);       // arithmetic exception
            System.out.println("....");
            int[] table = new int[5];
//            System.out.println(table[10]);   // out of bound exception
//            System.out.println(table[0]);    // null pointer exception
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write number");
            scanner.nextInt();
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Something went wrong");
        } catch (Exception e) {
            System.out.println("Oh no, unexpected problem. Tell Your developer about that!");
        }
        System.out.println("end");
    }
}
