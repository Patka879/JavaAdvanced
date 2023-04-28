package org.example.advanced.arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("Daniel");
        names.add("Iza");
        names.add("Marcin");
        names.add("Iza");
        names.add("Ada");
        names.add(0, "Magda");
        System.out.println(names);
        System.out.println(names.size());
//        names.remove("Iza");
        names.remove(2);
        System.out.println(names);
//        names.remove("Iza");
        names.remove(3);
        System.out.println(names);
//        names.clear();
//        System.out.println(names);
        System.out.println(names.contains("Marcin"));
        for (String name : names) {
            System.out.println(name);
        }
        String firstName = names.get(0);
        System.out.println(firstName);
        System.out.println("--------");
        //50
        names.set(0, "Magdalena");
        System.out.println(names);

        System.out.println("----");

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
//        list.add(1);
//        list.add(2);
//        list.add(3);
        list.remove(2);
        System.out.println(list);
        String letter = (String) list.get(2);
        System.out.println(letter);

        Integer integer = null;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(1);
        numbers.add(1);
        numbers.add(23);
        numbers.add(8);
        numbers.add(20);
        int number = numbers.get(0);
        System.out.println(number);
        System.out.println("--------------");
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(8);
        numbers2.add(9);
        numbers2.add(10);
        numbers2.add(10);
        numbers2.add(11);
        numbers2.add(12);
        numbers2.add(13);
        numbers2.add(14);
        numbers2.add(15);
//        ArrayList<Integer> numbers2 = new ArrayList<>(numbers);
        // numbers2.addAll(numbers);

//        numbers2.removeAll(numbers);
        numbers2.retainAll(numbers);
        System.out.println(numbers);
        System.out.println(numbers2);
    }
}
