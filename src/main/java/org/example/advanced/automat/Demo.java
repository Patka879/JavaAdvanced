package org.example.advanced.automat;

public class Demo {
    public static void main(String[] args) {
        GameMachineController gameMachineController = new GameMachineController();

        gameMachineController.addGame("The Witcher", 250);
        gameMachineController.addGame("COD", 100);
        gameMachineController.addGame("FIFA 2023", 250);
        gameMachineController.addGame("GTA", 240);

        gameMachineController.machineEngine();
    }
}
