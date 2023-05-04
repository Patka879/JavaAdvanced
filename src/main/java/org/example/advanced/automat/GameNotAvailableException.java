package org.example.advanced.automat;

public class GameNotAvailableException extends Exception {
    public GameNotAvailableException() {
        super("This game is not available");
    }
}
