package org.example.advanced.collections.lists.food;

public enum Type {
    BREAKFAST ("breakfast"),
    DINNER ("dinner"),
    BRUNCH ("brunch"),
    LUNCH ("lunch");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
