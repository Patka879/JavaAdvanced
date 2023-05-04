package org.example.advanced.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadsDemo4 {
    public static void main(String[] args) throws InterruptedException {
        CounterTask task = new CounterTask();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(task.getNumber());
        System.out.println(task.getAtomicNumber());

//        String text = "abc";
//        System.out.println(text.toUpperCase().repeat(10).concat("sdf").charAt(3));
    }
}


class CounterTask implements Runnable{

    private int number = 0;
    private AtomicInteger atomicNumber = new AtomicInteger(0); // automatically synchronized version of Integer
    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            // number++;
            increment();
            atomicNumber.incrementAndGet();
        }
    }

    public synchronized void increment() {
        int newNumber = number + 1;
        number = newNumber;
    }
    public int getNumber() {
        return number;
    }

    public int getAtomicNumber() {
        return atomicNumber.get();
    }
}

/*
 * number = 2;
 * T1: newNumber = 1;
 * T1: number = 1;
 * T2: newNumber = 2;
 * T1: newNumber = 2;
 * T1: number = 2;
 * T1: newNumber = 3;
 * T1: number = 3;
 * T1: newNumber = 4;
 * T1: number = 4;
 * T2: number = 2;
 * */
