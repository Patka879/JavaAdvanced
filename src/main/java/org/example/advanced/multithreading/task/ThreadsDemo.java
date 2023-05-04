package org.example.advanced.multithreading.task;

import org.example.advanced.multithreading.task.Task;

/**
 * Create a new thread in main in two different ways. By declaring a Task class that implements the
 * Runnable interface and using an anonymous class that implements Runnable. Both threads are supposed
 * to print 10_000 times any text and the number of the current iteration (variable and from the loop).
 */
public class ThreadsDemo {
    public static void main(String[] args) {

        Task task = new Task("*******Working******");
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000; i++) {
                    System.out.println(i + " ==== ALSO WORKING====");
                }
            }
        };

        Thread thread = new Thread(task);
        Thread thread2 = new Thread(task2);

        thread.start();
        thread2.start();

    }
}
