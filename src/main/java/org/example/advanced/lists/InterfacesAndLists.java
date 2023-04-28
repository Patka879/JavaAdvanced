package org.example.advanced.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfacesAndLists {
    public static void main(String[] arr) {
        List<String> names = new LinkedList<>();
        System.out.println(names.size());
        names.add("Daniel");                    // In queue new elements goes at the end of the array
        names.add("Iza");
        names.add("Marcin");
        names.add("Iza");
        names.add("Ada");
        String elementTwo = names.get(2);       // You can't do that in queue. You can only access first element
        System.out.println(elementTwo);
        sayHello(names);
    }

    public static void sayHello(List<String> list) {
        for (String name : list){
            System.out.println(name + " say hello");
        }
    }
}
