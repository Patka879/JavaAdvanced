package org.example.advanced.inheritance.animals.constructors;

public class ConstructorsExample {
    public static void main(String[] args) {
//        A a = new A(); // created in B
        B b = new B();

    }
}

   class A extends Object {

        public A() {
            System.out.println("A created");
        }
        public A(int num) {
            super();
            System.out.println("A created " + num);
        }

        public A(String str) {
            System.out.println("A created " + str);
        }
    }

    class B extends A {
        private int number = 1;
        public B() {
            super();
            System.out.println("B created");
        }
    }

