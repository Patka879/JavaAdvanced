package org.example.basics;

public class Person {

    private String name;
    private int age;
    private Address address;

    public Person(String name, int age) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
        this.age = age;
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void sayHello() {
        System.out.println("My name is " + name + " and i'm " + age + " year old");
    }

    public void makeBirthday() {
        age++;
    }

/*    public String toString() {
        return "My name is " + name + " and i'm " + age + " year old";
    }*/

 /*   public void setAddress(String city, String street, int streetNumber) {
        address = city + " " + street + " " + streetNumber;
        address = String.format("%s %s %d", city,street,streetNumber);
    }*/

    public void setAddress(Address address) {
//        address = city + " " + street + " " + streetNumber;
//        address = String.format("%s %s %d", city,street,streetNumber);
        this.address = address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}