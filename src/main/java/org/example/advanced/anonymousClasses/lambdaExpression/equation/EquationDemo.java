package org.example.advanced.anonymousClasses.lambdaExpression.equation;

/**
 * ================== LAMBDA EXPRESSIONS =============================
 * Interfaces with one abstract method are called FUNCTIONAL INTERFACES.
 *
 * LAMBDA EXPRESSION is a simplification of the code when we try to quickly implement interface with one
 * abstract method.
 */
public class EquationDemo {
    public static void main(String[] args) {

        //LAMBDA EXPRESSION:
        // get rid of @Override
        // we don't need to point on interface Equation. it knows it from the context
        // {} not needed to say it is a class
        // no need to mention the name of the method because there is only one method
        // we don't need to specify types of our variables
        // WHAT WE NEED : parameters and expression of what we want to return statement;

        Equation addition = (int num1, int num2) -> num1 + num2;

        Equation subtraction = (num1, num2) -> num1 - num2;

        Equation multiply = (num1, num2) -> num1 * num2;

        System.out.println(addition.doEquation(6, 10));
        System.out.println(subtraction.doEquation(6, 10));
        System.out.println(multiply.doEquation(6, 10));
    }
}



