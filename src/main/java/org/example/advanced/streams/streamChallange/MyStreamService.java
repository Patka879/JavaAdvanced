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
        // arrays dont have method streams but we can use

        Arrays.stream(numbers);
        return 0;
    }

    @Override
    public List<String> computeMaleNames(List<String> names) {
        return null;
    }

    @Override
    public void printNumbersOfRange(int[] numbers, int minValue, int maxValue) {

    }

    @Override
    public List<Integer> computeNamesLength(List<String> names) {
        return null;
    }

    @Override
    public List<Person> buildPeopleWithNames(List<String> names) {
        return null;
    }

    @Override
    public List<Person> findPeopleOfIdGreaterThan(List<Person> people, int id) {
        return null;
    }

    @Override
    public boolean hasSenior(List<Person> people) {
        return false;
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