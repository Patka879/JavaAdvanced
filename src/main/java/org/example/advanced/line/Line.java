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

    // Manually written getters and setters


    public int getLength() {
        return length;
    }

    public char getFilling() {
        return filling;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setFilling(char filling) {
        this.filling = filling;
    }

    public void printLine() {
        for (int i = 0; i < length; i++) {
            System.out.print(filling);
        }
        System.out.println();
    }

    public String toString() {
        return "Line length is " + length + " and symbol used to build the line is " + filling;
    }
}
