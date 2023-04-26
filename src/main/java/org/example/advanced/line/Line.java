package org.example.advanced.line;

public class Line {
    private int length;
    private char filling;

    public Line(int length, char filling) {
        this.length = length;
        this.filling = filling;
    }

    // Manually generated
    public Line(char filling) {
        this.filling = filling;
    }

    // Automatically generated
    public Line(int length) {
        this.length = length;
    }

    public void printLine() {
        for (int i = 0; i < length; i++) {
            System.out.print(filling);
        }
        System.out.println();
    }
}
