package org.example.advanced.interfaces;

public class Daughter implements FamilyMember {
    private String name;

    public Daughter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isAdult() {
        return false;
    }
    @Override
    public void introduce() {
        System.out.println("I am daughter ;)");
    }
}
