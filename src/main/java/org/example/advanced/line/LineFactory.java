package org.example.advanced.line;

import java.util.Random;

public class LineFactory {

        private final Random random = new Random();
        int length = 2;

        public Line withRandomLength(String filling) {
            return new Line(getRandomLength(), filling);
        }

        public Line withRandomFilling(int length) {
            return new Line(length,getRandomFilling());
        }

        public Line withRandomFillingAndRandomLength(){
            return new Line(getRandomLength(), getRandomFilling());
        }

        public Line[] createManyRandomLines(int lineCount){
            Line[] lines = new Line[lineCount];
            for (int i = 0; i < lineCount; i++) {
                lines[i] = withRandomFillingAndRandomLength();
            }
            return lines;
        }

        public Line createLineWithGrowingLength() {
            Line line = new Line(length, getRandomFilling());
            length *= 2;
            return line;
        }

        private String getRandomFilling() {
            char randomFilling =(char) random.nextInt(50,100);
            return randomFilling + "";
        }

        private int getRandomLength() {
            return random.nextInt(1, 20);
        }

}
