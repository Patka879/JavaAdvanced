package org.example.advanced.animals.animals;

import java.util.Arrays;

public class Dog extends Animal {

    private String[] tricks;
    private int lastTrickIndex = 0;

    public Dog(String name, int age, int maxTricks) {
        this.name = name;
        this.age = age;
        this.tricks = new String[maxTricks];
    }

    public Dog() {
        name = "Bruno";
        age = 8;
        tricks = new String[3];
    }

    public void makeSound() {
        bark();
    }


    public void bark() {
        System.out.println("woof, woof");
    }

    public void teachDogNewTrick(String trick) {
        if (lastTrickIndex == tricks.length) {
            System.out.println("Sorry, this dog is old and cannot learn any new tricks :(");
            bark();
            return;
        }
        tricks[lastTrickIndex++] = trick;
    }


    public void doTricks() {
        System.out.println("Dog do:");
        for (String trick : tricks) {
            if (trick == null) {
                return;
            }
            System.out.println(trick);
        }
    }

    @Override
    public String toString() {
        return "DOG: Name" + name +
                " Age: " + age +
                " Tricks: " + Arrays.toString(tricks) +
                " Last trick index: " + lastTrickIndex;
    }

    public void eatSomething() {
        System.out.println("Dog is eating doggie stuff");
    }
}
