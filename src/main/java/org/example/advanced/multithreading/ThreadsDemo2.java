package org.example.advanced.multithreading;

public class ThreadsDemo2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1_000 ; i++) {
                    System.out.println("Thread 1 GOING");
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1_000 ; i++) {
                    System.out.println("Thread 2 RUNNING");
                }
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("error");
        }

        System.out.println("Program stopped running");
    }

}
