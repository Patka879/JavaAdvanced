package org.example.advanced.line;

public class LineFactoryDemo {
    public static void main(String[] args) {
        Line line6 = LineFactory.randomLength('%'); //Line generated with random length:
        Line line7 = LineFactory.randomCharacter(10); // Line generated with random character;
        Line line8 = LineFactory.randomLengthAndCharacter(); // Line generated with random character and length;
        Line line9 = LineFactory.randomCharacterLineWithIncreasedLength(2); // Line that increases length by 2 with every initialization

        System.out.println("Random length");
        line6.printLine();
        System.out.println("Random character");
        line7.printLine();
        System.out.println("Random length and character");
        line8.printLine();
        System.out.println("Line that doubles length with every initialization");
        line9.printLine();
        line9.printLine();
        line9.printLine();
    }
}
