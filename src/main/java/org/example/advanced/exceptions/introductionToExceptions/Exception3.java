package org.example.advanced.exceptions.introductionToExceptions;

public class Exception3 {
    public static void main(String[] args) {
        //NullPointerException

        String[] arr = null;
        try {
            String element = arr[0];
            System.out.println(element);
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
    }
}
