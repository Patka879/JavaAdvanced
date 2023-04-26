package org.example.advanced.house;

public class Window {
    private boolean canOpen;

    public Window(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public Window() {
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public String isWindowOpen() {
        return "This window is " + (canOpen ? "opened" : "closed");
    }

    @Override
    public String toString() {
        return  "This window is " + (canOpen ? "opened" : "closed");
    }
}
