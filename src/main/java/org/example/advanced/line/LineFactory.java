package org.example.advanced.line;

import java.util.Random;

public class LineFactory {
    private Line line;

    public LineFactory(Line line) {
        this.line = line;
    }

    public static Line randomLength(char filling) {
        Random random = new Random();
        int randomNumber = random.nextInt(50);
        return new Line(randomNumber, filling);
    }

    public static Line randomCharacter(int length) {
        String characters = "!@#$%^&*(){}?><:|][';/.,";
        Random random = new Random();
        char character = characters.charAt(random.nextInt(characters.length()));
        return new Line(length, character);
    }

    public static Line randomLengthAndCharacter() {
        Random random = new Random();

        String characters = "!@#$%^&*(){}?><:|][';/.,";
        char character = characters.charAt(random.nextInt(characters.length()));

        int randomNumber = random.nextInt(50);

        return new Line(randomNumber, character);
    }

    public static Line randomCharacterLineWithIncreasedLength(int length) {
        String characters = "!@#$%^&*(){}?><:|][';/.,";
        Random random = new Random();
        char character = characters.charAt(random.nextInt(characters.length()));
        Line line = new Line(length, character);
        length *= 2;
        return line;
    }
}
