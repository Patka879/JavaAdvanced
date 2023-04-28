package org.example.advanced.animals.animals;

import org.example.advanced.animals.Pet;
import org.example.advanced.animals.WildAnimal;
import org.example.advanced.animals.animals.Animal;

public class Cat extends Animal implements Pet, WildAnimal {

    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat() {
        name = "Luna";
        age = 1;
        color = "black";
    }


    public void makeSound() {
        meow();
    }
    public void meow() {
        System.out.println("meow! meow...");
    }

    public void distractTheOwner() {
        System.out.println(name + " is distracting with it's meowing...");
        meow();
        meow();
        meow();
        meow();
        meow();
    }

    public void eatSomething() {
        super.eatSomething();
        System.out.println("this animal is cat and it's eating mice");
    }

    @Override
    public void pet() {
        System.out.println("Cat is not happy to be petted.");
    }


    @Override
    public void attack() {
        System.out.println("Cat scratched You");
    }
}
