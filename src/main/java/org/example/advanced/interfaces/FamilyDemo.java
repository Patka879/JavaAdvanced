package org.example.advanced.interfaces;

import java.util.ArrayList;
import java.util.List;

public class FamilyDemo {

    public static void main(String[] name) {
        List<FamilyMember> family = new ArrayList<>();

        family.add(new Father("John"));
        family.add(new Mother("Jane"));
        family.add(new Daughter("Julia"));
        family.add(new Daughter("Kate"));
        family.add(new Son("Lukas"));

        for (FamilyMember familyMember : family) {
            System.out.println("My name is " + familyMember.getName());
            familyMember.introduce();
            System.out.println("I am an adult? " + familyMember.isAdult());
            System.out.println("===================================");
        }
    }
}
