package org.example.advanced.animals;

public class AnimalKeeper {

    public void feedDog(Dog dog) {
        System.out.println("Feeding the dog");
        dog.eatSomething();
        dog.bark();
    }

    public void feedCat(Cat cat) {
        System.out.println("Feeding the cat");
        cat.eatSomething();
        cat.meow();
    }

    public void feedGuineaPig(GuineaPig guineaPig) {
        System.out.println("Feeding the guinea pig");
        guineaPig.makeSound();
        guineaPig.eatSomething();
    }

    public void feed(Animal animal) {
        System.out.println("Feeding");
        animal.makeSound();
        animal.eatSomething();
        //polymorphism
//     how to make it make a sound?
//        animal.getClass().equals(Dog.class)
        //no polymorphism approach (wrong)
        /*if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        }else if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.meow();
        }*/

        //it is imposible to call dog methods on type Animal
//        animal.bark();
//        animal.meow();
    }

}
