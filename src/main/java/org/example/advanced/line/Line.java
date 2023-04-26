package org.example.advanced.line;

public class Line {
    private int length;
    private char filling;

    public Line(int length, char symbol) {
        this.length = length;
        this.filling = symbol;
    }

    public void printLine() {
        for (int i = 0; i < length; i++) {
            System.out.print(filling);
        }
        System.out.println();
    }
}
