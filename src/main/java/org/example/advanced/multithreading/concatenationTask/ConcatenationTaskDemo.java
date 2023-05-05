package org.example.advanced.multithreading.concatenationTask;


public class ConcatenationTaskDemo {
    public static void main(String[] args) {
        Concatenation concatenation = new Concatenation(500000, 'P');

        concatenation.startTask();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                concatenation.abort();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        concatenation.joinThread();

        System.out.println("Result length: " + concatenation.getResult().length());
    }
}


