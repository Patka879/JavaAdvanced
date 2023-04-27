package org.example.advanced.postoffice;

public enum Status {
    CREATED("c"),
    SHIPPED("s"),
    REJECTED("r");

    private String abbreviate;

    Status(String abbreviate) {
        this.abbreviate = abbreviate;
    }

    public String getAbbreviate() {
        return abbreviate;
    }

    public static Status findByAbbreviation(String str) {
        for (Status value: Status.values()) {
            if (value.abbreviate.equalsIgnoreCase(str)) {
                return value;
            }
        }
        return null;
    }
}
