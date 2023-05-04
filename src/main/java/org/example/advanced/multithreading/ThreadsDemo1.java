package org.example.advanced.multithreading;

public class ThreadsDemo1 {
    public static void main(String[] args) {
        //1. Create task
        Runnable task = new Runnable() { //Runnable is an interface
            @Override
            public void run() {
                for (int i = 0; i <100; i++) {
                    System.out.println("Working on another thread...");
                }
            }
        };

        //2. Create worker + give task to worker
        Thread worker = new Thread(task);

        //4. Instruct worker to start working
        worker.start();
         for (int i = 0; i <100; i++) {
             System.out.println("MAIN THREAD");
         }
    }
}
