package org.example.advanced.interfaces;

public class Father implements FamilyMember{
    private String name;

    public Father(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isAdult() {
        return true;
    }
    @Override
    public void introduce() {
        System.out.println("I am father");
    }
}
