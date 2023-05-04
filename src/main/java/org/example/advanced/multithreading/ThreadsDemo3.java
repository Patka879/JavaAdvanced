package org.example.advanced.multithreading;

import java.util.Scanner;

public class ThreadsDemo3 {
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1000);

        Thread thread = new Thread(new ReadTextTask());
        thread.start();

        Thread thread2 = new Thread(new ReadTextTask() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    thread.stop();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}

class ReadTextTask implements Runnable{
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name here:");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
