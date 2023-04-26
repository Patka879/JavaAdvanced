package org.example.advanced.line;

public class SymbolsDemo {

    public static void main(String[] args) {
        Line line = new Line(10, "*");
        Line line2 = new Line(5, "@");
        Line line3 = new Line(10, "&");

        Rectangle rectangle1 = new Rectangle(10, 20, '%');
        Rectangle rectangle2 = new Rectangle(3,6, '$');
        Rectangle rectangle3 = new Rectangle(5,6, '#');

        line.print();
        line2.print();
        line3.print();

        rectangle1.printRectangle();
        rectangle2.printRectangle();
        rectangle3.printRectangle();

        System.out.println(line);

    }

}
