package org.example.advanced.streams.streamChallange;

import java.util.Arrays;
import java.util.List;

public class MyStreamService implements StreamService{

    @Override
    public void sortAndPrint(List<String> names) {
        names.stream()
                .sorted()
                .forEach(name -> System.out.println(name));
    }

    @Override
    public int distinctAndCountNumbers(int[] numbers) {
        // arrays don't have method streams, but we can use this:

        return Arrays.stream(numbers)
                .distinct()
                .sum();

    }

    @Override
    public List<String> computeMaleNames(List<String> names) {
        return names.stream()
                .filter(name -> name.endsWith("a"))
                .toList();
    }

    @Override
    public void printNumbersOfRange(int[] numbers, int minValue, int maxValue) {
        Arrays.stream(numbers)
                .filter(number -> number >= minValue && number <= maxValue)
                .forEach(System.out::println);
    }

    @Override
    public List<Integer> computeNamesLength(List<String> names) {
        return names.stream()
                .map(name -> name.length())
                .toList();
    }

    @Override
    public List<MyPerson> buildPeopleWithNames(List<String> names) {
        return names.stream()
                .map(name -> new MyPerson(name))
                .toList();
    }

    @Override
    public List<MyPerson> findPeopleOfIdGreaterThan(List<MyPerson> people, int id) {
        return people.stream()
                .filter(person -> person.getId() > id)
                .toList();
    }

    @Override
    public boolean hasSenior(List<MyPerson> people) {
        return people.stream()
                .anyMatch(person -> person.getAge() > 60);
    }

    @Override
    public double sumTotalCash(List<Person> people) {
        return 0;
    }

    @Override
    public Person findRichestPerson(List<Person> people) {
        return null;
    }

    @Override
    public double computeAverageAge(List<Person> people) {
        return 0;
    }
}
