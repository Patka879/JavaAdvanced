package org.example.advanced.interfaces;

public interface FamilyMember {

    boolean isAdult();

    String getName();

    default void introduce() {
        System.out.println("I am just a simple family member");
    }
}
