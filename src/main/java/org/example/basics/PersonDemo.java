package org.example.basics;

public class PersonDemo {
    public static void main(String[] args) {


        Person person1 = new Person("adam",30);
        //person1 = new Random();
        // person1.sayHello();

        Person person2 = new Person("Iza",33);
        //  person2.sayHello();
        // person1.age = -123123;

        System.out.println(person1);
        System.out.println(person2);

//        System.out.println(person1.name);
//        System.out.println(person2.name);

//        person1.sayHello();
//        person2.sayHello();

        person1.makeBirthday();
//        person1.sayHello();
        System.out.println(person1);
        System.out.println(person2.toString());

//        person1.setAddress("Szczecin", "Mickiewicza", 30);
        Address address = new Address("Szczecin", "Mickiewicza", 30);
        person1.setAddress(address);
        System.out.println(person1);
    }
}