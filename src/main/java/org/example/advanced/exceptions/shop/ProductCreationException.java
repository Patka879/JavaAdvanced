package org.example.advanced.exceptions.shop;

public class ProductCreationException extends Exception {
    private String corruptedLineThatCasedProblem;

    public ProductCreationException(String message, String corruptedLineThatCasedProblem) {
        super(message);
        this.corruptedLineThatCasedProblem = corruptedLineThatCasedProblem;
    }

    public String getCorruptedLineThatCasedProblem() {
        return corruptedLineThatCasedProblem;
    }
}
