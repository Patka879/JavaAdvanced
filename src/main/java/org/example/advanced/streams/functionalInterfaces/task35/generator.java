package org.example.advanced.streams.functionalInterfaces.task35;

import java.util.Comparator;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Using already existing functional interfaces such as: Function, Consumer, Supplier, Predicate, Comparator,
 * implement a function that allows you to:
 * - generate a random number between 1 and 10,
 * - check that the password is at least 5 characters long,
 * - comparing two strings along the length (difficult).
 */
public class generator {
    public static void main(String[] args) {
        // Generate number between 1 and 10
        Supplier <Integer> randomNumber = () -> new Random().nextInt(1, 11);
        System.out.println(randomNumber.get());

        // Check that the password is at least 5 characters long
        Predicate<String> isPasswordLongEnough = String -> String.length() >= 5;
        System.out.println(isPasswordLongEnough.test("Password"));
        System.out.println(isPasswordLongEnough.test("Pass"));

        // Comparing two strings along the length (difficult).
        Comparator<String> compareLength = (str1, str2)-> {
            int result;
            if (str1.length() > str2.length()) {
                result = str1.length();
                System.out.println("Longer string: " + str1);
            } else if (str1.length() < str2.length())  {
                result = str2.length();
                System.out.println("Longer string: " + str2);
            } else {
                result = str1.length();
                System.out.println("Both strings are equal");
            }
            return result;
        };

        System.out.println(compareLength.compare("Lambda", "Expression"));
        System.out.println(compareLength.compare("Dog", "Cat"));
    }

}
