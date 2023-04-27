package org.example.advanced.animals.animals;

public abstract class Animal {

    String name;
    int age;

    public void eatSomething() {
        System.out.println("Animal is eating");
    }

    // in abstract classes we can make abstract methods
    public abstract void makeSound();
        //there is no body in abstract method so overwriting this method is necessary




}
