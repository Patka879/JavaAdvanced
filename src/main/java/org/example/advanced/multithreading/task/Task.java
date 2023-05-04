package org.example.advanced.multithreading.task;

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + " " + name);
        }
    }
}
