package org.example.advanced.animals;

public class AnimalKeeper {

    public void feedDog(Dog dog) {
        dog.eatSomething();
        dog.bark();
    }

    public void feedCat(Cat cat) {
        cat.eatSomething();
        cat.meow();
    }

    public void feedGuineaPig(GuineaPig guineaPig) {
        guineaPig.makeSound();
        guineaPig.eatSomething();
    }

    public void feed(Animal animal) {
        animal.eatSomething();
        animal.makeSound();
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
