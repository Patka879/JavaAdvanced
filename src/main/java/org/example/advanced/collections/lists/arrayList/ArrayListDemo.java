package org.example.advanced.collections.lists.arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());                   // size() returns length of an array
        names.add("Daniel");                                // add () adds element to an array
        names.add("Iza");
        names.add("Marcin");
        names.add("Iza");
        names.add("Ada");
        names.add(0, "Magda");                 // adds element ad specific index
        System.out.println(names);
        System.out.println(names.size());
//        names.remove("Iza");
        names.remove(2);                               // removes element at specific index
        System.out.println(names);
//        names.remove("Iza");
        names.remove("Iza");                              // removes specific element from an array
        System.out.println(names);                          // clear() removes all elements from an array
//        names.clear();
//        System.out.println(names);
        System.out.println("=====CONTAINS======");          // contains() returns "true" when an array contains given element
        System.out.println(names.contains("Marcin"));
        System.out.println("=====LOOP AND PRINT ALL ELEMENTS=====");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("====RETURNS ELEMENT AT INDEX 0=====");
        String firstName = names.get(0);                    // get(0) returns element at index 0
        System.out.println(firstName);
        System.out.println("======REPLACING ELEMENTS=====");
        //50
        names.set(0, "Magdalena");                          // replaces element at given index with new element
        System.out.println(names);

        System.out.println("----");

        ArrayList<String> list = new ArrayList<>();
        System.out.println("=====REMOVING ELEMENT AT INDEX 2======");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println("=====PRINTING ELEMENT AT INDEX 2======");
        String letter = (String) list.get(2);
        System.out.println(letter);
        System.out.println("=====PRINTING INTEGER AT INDEX 0======");
        Integer integer = null;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(1);
        numbers.add(1);
        numbers.add(23);
        numbers.add(8);
        numbers.add(20);
        System.out.println(numbers);
        int number = numbers.get(0);
        System.out.println(number);
        System.out.println("=====RETAINING ELEMENTS FROM ARRAY ABOVE=====");
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
//      retainAll() method is used to remove all the elements
//      from the collection that are not present in another collection
        numbers2.retainAll(numbers);
        System.out.println(numbers);
        System.out.println("====all elements in array numbers 2 are removed that were not present in array numbers");
        System.out.println(numbers2);
    }
}
