package org.example.advanced.anonymousClasses.lambdaExpression.generator;

import java.util.Random;

public class GeneratorDemo {
    public static void main(String[] args) {
        Generator randomNumber = () -> {
            Random random = new Random();
            return random.nextInt(0,11);
        };

        System.out.println(randomNumber.generator());
        System.out.println(randomNumber.generator());
        System.out.println(randomNumber.generator());
    }
}
