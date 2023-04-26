package org.example.advanced.line;

public class Rectangle {
    private int height;
    private int width;
    private char filling;

    public Rectangle(int height, int width, char filling) {
        this.height = height;
        this.width = width;
        this.filling = filling;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public char getFilling() {
        return filling;
    }
}
