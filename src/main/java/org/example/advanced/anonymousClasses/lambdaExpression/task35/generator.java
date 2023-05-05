package org.example.advanced.anonymousClasses.lambdaExpression.task35;

import java.util.Random;
import java.util.function.Function;
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

        Random random = new Random();
        Supplier <Integer> randomNumber = (Supplier) () -> random.nextInt(20);
        System.out.println(randomNumber.get());
    }
}
