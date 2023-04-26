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

    public void printRectangle() {
        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height-1 ||
                        j== 0 || j == width-1)
                    System.out.print(filling);
                else
                    System.out.print(" ");
            }
        }
    }
}
