package org.example.advanced.inheritance.animals;

import org.example.advanced.inheritance.animals.animals.Animal;

public class Mouse extends Animal {
    @Override
    public void makeSound() {
        System.out.println("bip bip");
    }
}
