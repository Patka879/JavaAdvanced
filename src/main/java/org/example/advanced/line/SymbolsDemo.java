package org.example.advanced.line;

public class SymbolsDemo {

    public static void main(String[] args) {
        Line line = new Line(10, '*');
        Line line2 = new Line(5, '@');
        Line line3 = new Line(10, '&');
        Line line4 = new Line('!'); // second constructor
        Line line5 = new Line(40); // third constructor
        Line line6 = LineFactory.randomLength('%'); //Line generated with random length:
        Line line7 = LineFactory.randomCharacter(10); // Line generated with random character;
        Line line8 = LineFactory.randomLengthAndCharacter(); // Line generated with random character and length;
        Line line9 = LineFactory.randomCharacterLineWithIncreasedLength(); // Line that increases length by 2 with every initialization

        Rectangle rectangle1 = new Rectangle(10, 20, '%');
        Rectangle rectangle2 = new Rectangle(3,6, '$');
        Rectangle rectangle3 = new Rectangle(5,6, '#');

        line.printLine();
        line2.printLine();
        line3.printLine();
        line4.printLine();
        line5.printLine();
        System.out.println("Random length");
        line6.printLine();
        System.out.println("Random character");
        line7.printLine();
        System.out.println("Random length and character");
        line8.printLine();
        System.out.println("Line that increases length by 2 with every initialization");
        line9.printLine();
        line9.printLine();
        line9.printLine();

//        rectangle1.printRectangle();
//        rectangle2.printRectangle();
//        rectangle3.printRectangle();

//        System.out.println(line);

    }

}
