package org.example.advanced.house;

public class Window extends House {
    private boolean canOpen;

    public Window(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public String isWindowOpen() {
        return "This window is " + (canOpen ? "opened" : "closed");
    }
}
