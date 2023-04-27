package org.example.advanced.animals;

import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog("Reksio", 10, 4);
        Cat cat = new Cat("Łukasz", 3, "white");
        Cat cat2 = new Cat();
        GuineaPig guineaPig = new GuineaPig("Ibiza", 4, "rosette");
        GuineaPig guineaPig2 = new GuineaPig();

        System.out.println(dog);
        dog.bark();
        dog.doTricks();
        dog.teachDogNewTrick("sit");
        dog.teachDogNewTrick("give hand");
        dog.teachDogNewTrick("play dead");
        dog.teachDogNewTrick("bark on command");
        dog.doTricks();
        dog.eatSomething();

        System.out.println(dog);

        System.out.println("---------");
        cat.meow();
        cat.distractTheOwner();
        cat.eatSomething();
        System.out.println("---------");
        AnimalKeeper animalKeeper = new AnimalKeeper();

        animalKeeper.feed(cat);
        animalKeeper.feed(dog);

        System.out.println("---------");
        System.out.println("----------");
        //polymorphism example
        Animal animal = new Dog();
        animal.makeSound();
        animal = new Cat();
        animal.makeSound();

        System.out.println("=============");
        System.out.println(guineaPig);
        System.out.println(guineaPig2);
        guineaPig.eatSomething();
        animal = new GuineaPig();
        animal.makeSound();
        System.out.println("============");
        animalKeeper.feed(guineaPig);

        Animal[] animals = new Animal[]{dog, dog2, cat, cat2, guineaPig, guineaPig2};


        System.out.println("=====ITERATING=====");
        for (Animal oneAnimal : animals) {
            oneAnimal.makeSound();
            oneAnimal.eatSomething();
        }
    }
}
