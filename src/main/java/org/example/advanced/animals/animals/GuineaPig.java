package org.example.advanced.animals.animals;

import org.example.advanced.animals.animals.Animal;

public class GuineaPig extends Animal {
    private String type;

    public GuineaPig(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public GuineaPig() {
        name = "Karol";
        age = 4;
        type = "Long haired";
    }

    public void makeSound() {
        squeek();
    }

    public void squeek() {
        System.out.println("squeek squeek");
    }

    public void eatSomething() {
        System.out.println("Guinea pig is eating a cucumber");
    }

    @Override
    public String toString() {
        return "GUINEA PIG: Name: " + name +
                " Age: " + age +
                " Type: " + type;
    }
}
