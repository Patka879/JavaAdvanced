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
        System.out.print("Insert cash");
        int amount = scanner.nextInt();
        try {
            gameMachine.buyGame(name, amount);
        } catch (GameNotAvailableException e) {
            System.out.println(e.getMessage());
        } catch (InsuficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
