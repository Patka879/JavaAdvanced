package org.example.advanced.multithreading.concatenationTask;


public class ConcatenationTaskDemo {
    public static void main(String[] args) {
        Concatenation concatenation = new Concatenation(100, 'P');

        concatenation.startTask();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                concatenation.abort();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();


        System.out.println("Result length: " + concatenation.getResult());
    }
}


