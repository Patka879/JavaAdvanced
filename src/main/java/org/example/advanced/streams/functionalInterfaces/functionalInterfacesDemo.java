package org.example.advanced.streams.functionalInterfaces;

import java.util.Random;
import java.util.function.*;

public class functionalInterfacesDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Hello"));
        thread.start();

        /**
         * CONSUMER: retrieve something and don't return anything: (T) -> void
         */
        Consumer<String> printer = text -> System.out.println(text);

        /**
         * SUPPLIER: don't retrieve anything and return something: () -> T
         */
        Supplier<String> nameGenerator = () -> {
            String[] names = {"Patrycja", "Jakub", "Kamila", "Mateusz"};
            return names[new Random().nextInt(names.length)];
        };
        System.out.println(nameGenerator.get());

        /**
         * FUNCTION: gets something and returns something: (T) -> R
         */

        Function<Integer, String> nameDuplicate = (Integer repetition) ->
            nameGenerator.get().concat(" ").repeat(repetition);

        System.out.println(nameDuplicate.apply(3));

        /**
         * OPERATOR: function that gets the same type and returns the same type: (T) -> T
         * It's like function but You decalre type only once.
         * For one operator: UNARY
         * For two operator: BINARY
         */

        BinaryOperator<String> connectText = (text1, text2) -> text1 + " " + text2;
        System.out.println(connectText.apply("Patrycja", "Mysiak"));
        System.out.println(connectText.apply(nameGenerator.get(), nameGenerator.get()));


        /**
         * PREDICATE: for testing values (test, filters, checks).
         * Takes some value and returns result of a test (type boolean)
         */

        Predicate<Integer> isItNegative = number -> number <= 0;
        System.out.println(isItNegative.test(-1));

        // Consumer
        // Supplier
        // Function
        // Operator
        // Predicate

        // Runnable
        // Comparator
        // ActionListener
    }
}
