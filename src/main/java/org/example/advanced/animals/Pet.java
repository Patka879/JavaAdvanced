package org.example.advanced.animals;

/**
 * You can extend only one abstract class, but You can implement many interfaces on one class
 */
public interface Pet {
    void eatSomething(); // it's abstract, but we don't have to say eat because interface is abstract by definition
                         // all methods in interfaces are ABSTRACT and PUBLIC. In interface there are no fields,
                         // constructors and all methods are public and abstract by definition.
    void pet();

}
