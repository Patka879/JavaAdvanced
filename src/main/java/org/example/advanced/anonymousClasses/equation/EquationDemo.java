package org.example.advanced.anonymousClasses.equation;

public class EquationDemo {
    public static void main(String[] args) {
        Equation addition = new Equation() {
            @Override
            public int doEquation(int num1, int num2) {
                return num1 + num2;
            }
        };

        Equation subtraction = new Equation() {
            @Override
            public int doEquation(int num1, int num2) {
                return num1 - num2;
            }
        };

        Equation multiply = new Equation() {
            @Override
            public int doEquation(int num1, int num2) {
                return num1 * num2;
            }
        };

        System.out.println(addition.doEquation(6,10));
        System.out.println(subtraction.doEquation(6,10));
        System.out.println(multiply.doEquation(6,10));

    }
}
