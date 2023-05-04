package org.example.advanced.automat;

import java.util.Scanner;

public class GameMachineController {
    private GameMachine gameMachine;

    public GameMachineController() {
        gameMachine = new GameMachine();
    }

    public void addGame(String name, int price) {
        gameMachine.addGame(new Game(name, price));
    }

    public void machineEngine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the game");
        String name = scanner.nextLine();
        System.out.println("Insert cash");
        int price = scanner.nextInt();
        try {
            gameMachine.buyGame(name, price);
        } catch (GameNotAvailableException e) {
            System.out.println(e.getMessage());
        } catch (InsuficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
