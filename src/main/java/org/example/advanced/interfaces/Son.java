package org.example.advanced.interfaces;

public class Son implements FamilyMember {

    private String name;

    public Son(String name) {
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
        System.out.println("Who is asking?");
    }
}
