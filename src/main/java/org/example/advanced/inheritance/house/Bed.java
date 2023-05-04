package org.example.advanced.inheritance.house;

public class Bed {
    int daysSinceBeddingWasChanged;

    public Bed(int daysSinceBeddingWasChanged) {
        this.daysSinceBeddingWasChanged = daysSinceBeddingWasChanged;
    }

    @Override
    public String toString() {
        return "There were "  + daysSinceBeddingWasChanged + " days since sheets were changed";
    }
}
