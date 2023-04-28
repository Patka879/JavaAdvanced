package org.example.advanced.animals;

public interface WildAnimal {

    int NUMBER = 10;         // final, public and static that's why we have to assign value.
    // final static fields are written in capital letters

    default void attack() {              // default means it's no longer abstract
        System.out.println("It attacks!");
    }

    public static void main(String[] args) {
        // we can make static methods like in every other class
    }
}
