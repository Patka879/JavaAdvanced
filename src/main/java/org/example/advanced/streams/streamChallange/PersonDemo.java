package org.example.advanced.streams.streamChallange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Marcin", "Zbyszek", "Kasia", "Zosia", "Kasia", "Magda", "Iza"));
        int[] primeNumbers = {2, 79, 83, 41, 43, 47, 53, 59, 13, 17, 83, 31,
                37, 61, 67, 89, 3, 5, 7, 7, 11, 71, 73, 97, 19, 19, 23, 29};

        StreamService streamService = new MyStreamService();

        streamService.sortAndPrint(names);
        System.out.println(streamService.distinctAndCountNumbers(primeNumbers));
        System.out.println(streamService.computeMaleNames(names));
        streamService.printNumbersOfRange(primeNumbers, 70, 100);
        System.out.println(streamService.computeNamesLength(names));


        List<MyPerson> people = streamService.buildPeopleWithNames(names);
        System.out.println(people);
        System.out.println(streamService.findPeopleOfIdGreaterThan(people, 2));
        System.out.println(streamService.hasSenior(people));
        //od tego momentu wykorzystuj również zbiór people do testu metod wykorzystujących argument List<Person>

    }

}
