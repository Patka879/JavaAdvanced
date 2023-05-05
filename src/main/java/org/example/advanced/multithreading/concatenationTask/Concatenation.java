package org.example.advanced.multithreading.concatenationTask;

public class Concatenation implements Runnable {
    private final int repetition;
    private final char input;
    private String result = "";
    private boolean aborted;
    private Thread thread;

    public Concatenation(int repetition, char input) {
        this.repetition = repetition;
        this.input = input;
        thread = new Thread(this);
    }

    public void abort() {
        aborted = true;
    }

    public String getResult() {
        return result;
    }

    public void startTask() {
        thread.start();
    }

    public void joinThread() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < repetition; i++) {
            if (aborted) {
                return;
            }
            result += input;
        }
    }

}
