package org.example.advanced.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Methods that utilize lambda expressions
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Iza");
        names.add("Adam");
        names.add("Ada");
        names.add("Daniel");
        names.add("Przemek");

        // we will apply consumer for each iteration:
        names.forEach(name -> System.out.println(name));

        // we will apply predicate to each iteration. We will remove everything that returns true for this test
        names.removeIf(name -> name.length() > 6);
        System.out.println(names);

        /**
         * STREAM is a representation of values from array list. We can modify those values but without changing
         * original list.
         * We don't apply it to any variable.
         * Return values are mostly Streams, but it depends on method.
         * There are methods which returns Strings: INTERMIDIETE METHODS that we can call multiple times
         * until we call FINISHING METHOD that returns for example int.
         */

        System.out.println(names.stream().count());

        names.stream()
                .map(name -> name.repeat(3))
                // IzaIzaIza
                .map(name ->name.substring(3, 6))
                //Iza
                .sorted()
                .forEach(nameFragment -> System.out.println(nameFragment) );

        // Original list is not changed
        System.out.println(names);


        /**
         * FILTER: Remove every element that starts with "I"
         * FOR EACH: Printing results
         */
        names.stream()
                .filter(name -> !name.startsWith("I"))
                .forEach(name -> System.out.println(name));


        /**
         * TO LIST: If we want to save those new elements we use "toList()" instead of printing
         */
        List<String> namesWithoutI = names.stream()
                                        .filter(name -> !name.startsWith("I"))
                                        .toList();

        System.out.println(namesWithoutI);


        /**
         * OPTIONAL: is a kind of box where You can put one value or leave it empty. It prevents from
         * accidentally calling method on null value (no such elemnent exception)
         *
         * We would get either empty string from orElse or first element if it's exists from find First
         */
        String result = names.stream()
                .sorted()
                .filter(name -> name.length() > 100)
                .findFirst()
//                .orElse("");
//                .get();
                .orElseThrow(() -> new NullPointerException()); //It will return no such el. exception, but we can modify it
                                                                // We can also put our own, designed exception

        System.out.println(result);

        /**
         * OPTIONALS are used when You are looking for a value but You are not sure if You are going to get it
         */
    }
}
