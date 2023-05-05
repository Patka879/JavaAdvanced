package org.example.advanced.anonymousClasses.lambdaExpression.commaCounter;

/**
 * Create TextConverter interface with proper abstract method and use it to create lambda expressions
 * that take text
 * fragment and count and return as int how many dots symbols (“.”) were used in the text.
 */
public class GeneratorDemo {
    public static void main(String[] args) {
        Counter count = str -> {
            int counter = 0;
            String[] letters = str.split("");
            for (String letter : letters) {
                if (letter.equals(",")) {
                    counter++;
                }
            }
            return counter;
        };

        System.out.println(count.counter("This, will, count commas"));
    }
}
