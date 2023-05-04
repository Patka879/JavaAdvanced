package org.example.advanced.multithreading.concatenationTask;

public class Concatenation implements Runnable {
    private final int repetition;
    private final char input;
    private String result;
    private boolean aborted;

    public Concatenation(int repetition, char input) {
        this.repetition = repetition;
        this.input = input;
    }

    public void abort() {
        aborted = true;
    }

    public String getResult() {
        return result;
    }

    public void startTask() {
        Thread thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        String concatenated = "";
        for (int i = 0; i < repetition; i++) {
            if (aborted) {
                result = null;
                return;
            }
            concatenated += input;
        }
        result = concatenated;
    }

}
