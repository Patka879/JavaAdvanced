package org.example.advanced.line;

public class LineDemo {

    public static void main(String[] args) {
        Line line = new Line(10, '*');
        Line line2 = new Line(5, '@');
        Line line3 = new Line(10, '&');

        line.printLine();
        line2.printLine();
        line3.printLine();
    }

}
