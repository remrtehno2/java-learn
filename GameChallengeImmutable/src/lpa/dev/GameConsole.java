package lpa.dev;

import lpa.dev.interfaces.Player;

import java.util.Scanner;

public class GameConsole<T extends Game<? extends Player>> {
    static Scanner scanner = new Scanner(System.in);
    private final T game;

    public GameConsole(T game) {
        this.game = game;
    }

    public int addPlayer() {
        System.out.println("Add new player: Enter new name?");
        String playerName = scanner.nextLine();

        int idPlayer = game.addPlayer(playerName.isEmpty() ? "Test" : playerName);

        System.out.printf("A new player has been added with [ID]: %d\n", idPlayer);

        return idPlayer;
    }

    public void playGame(int idPlayer) {
        boolean done;

        do {
            System.out.println("Enter your choice: ");

            game.getGameActions().forEach((key, value) -> {
                System.out.printf("[%s]: %s \n", key, value);
            });

            char userInput = scanner.nextLine().toUpperCase().toCharArray()[0];

            GameAction action = game.getGameActions().get(userInput);
            done = game.executeGameAction(idPlayer, action);


        } while (!done);
    }
}
