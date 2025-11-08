package lpa.pirate;

import lpa.dev.Game;
import lpa.dev.GameAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PirateGame extends Game<Pirate> {
    private static final List<List<Town>> levelMap = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        // Level 1 Towns
        levelMap.add(List.of(
                new Town("Bridgetown, Barbados"),
                new Town("Fitts Village, Barbados"),
                new Town("Holetown, Barbados")
        ));
        // Level 2 Towns
        levelMap.add(List.of(
                new Town("Fort-de-France, Martinique"),
                new Town("Sainte-Anne, Martinique"),
                new Town("Le Vauclin, Martinique")
        ));
    }

    private char lastKeyPressed;

    {
        for (Weapon weapon : Weapon.values()) {
            this.gameActions.put(
                    weapon.toString().charAt(0),
                    new GameAction(weapon.toString().charAt(0),
                            "Use weapon %s".formatted(weapon),
                            this::useWeapon
                    )
            );
        }

        this.gameActions.put(
                'E', new GameAction('E', "Find loot", this::findLoot)
        );

        this.gameActions.put(
                'P', new GameAction('P', "Press to print the info", this::printPlayer)
        );

        this.gameActions.put(
                'Q', new GameAction('Q', "Quite the game", this::quitGames)
        );
    }

    @Override
    public Pirate createNewPlayer(String name) {
        return new Pirate(name);
    }

    @Override
    public Map<Character, GameAction> getGameActions() {
        Pirate pirate = players.get(0);
        System.out.println(pirate);
        return this.gameActions;
    }

    @Override
    public boolean executeGameAction(int player, GameAction action) {
        lastKeyPressed = action.key();
        return super.executeGameAction(player, action);
    }

    public boolean useWeapon(int playerId) {
        System.out.printf("You have use the weapon: %s \n", getGameActions().get(lastKeyPressed));
        Pirate pirate = players.get(playerId);

        pirate.setCurrentWeapon(Weapon.AXE);
        pirate.getTownsVisited().add(
                levelMap.get(0).get(0).name()
        );
        return false;
    }

    public boolean findLoot(int playerId) {
//        players.get(playerId)
        return false;
    }
}
