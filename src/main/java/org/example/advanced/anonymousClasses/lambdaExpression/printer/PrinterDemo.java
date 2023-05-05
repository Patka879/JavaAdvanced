package org.example.advanced.anonymousClasses.lambdaExpression.printer;

public class PrinterDemo {
    public static void main(String[] args) {
        Printer screamingFunction = str -> str.toUpperCase();
        System.out.println(screamingFunction.print("lambda expression"));

        Printer firstLetterWord = str -> {
            String joined = "";
            String[] words = str.split(" ");
            for (String word : words) {
                joined += word.charAt(0);
            }
            return joined;
        };

        System.out.println(firstLetterWord.print("This will be a word created from first letter of the sentence"));
    }
}
