package org.example.advanced.animals;

import org.example.advanced.animals.animals.Animal;
import org.example.advanced.animals.animals.Cat;
import org.example.advanced.animals.animals.Dog;
import org.example.advanced.animals.animals.GuineaPig;

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
        Mouse mouse = new Mouse();
        Animal[] animals = {dog, dog2, cat, cat2, guineaPig, guineaPig2, animal, mouse};
        System.out.println("=====ITERATING=====");
        for (Animal oneAnimal : animals) {
            oneAnimal.makeSound();
            oneAnimal.eatSomething();
        }
        System.out.println("======================================");
        System.out.println("Animal Keeper loop");
        animalKeeper.feed(dog, dog2, cat, cat2, mouse);
        System.out.println(animals.length);
    }
}

// what is abstract method
// what is polymofpysm
// how constructor works in inheritance
// what are acces types
// what protected type does