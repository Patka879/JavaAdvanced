package org.example.advanced.automat;

public class InsuficientFundsException extends Exception {
    public InsuficientFundsException() {
        super("Not enough money to purchase the game");
    }
}
