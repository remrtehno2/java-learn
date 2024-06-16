package lpa.dev;

import lpa.dev.interfaces.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Game<T extends Player> {
    private String gameName;
    protected final List<T> players = new ArrayList<>();
    protected Map<Character, GameAction> gameActions = new HashMap<>();

    public abstract T createNewPlayer(String name);


    public abstract Map<Character, GameAction> getGameActions();

    // concrete methods
    public int addPlayer(String name) {
        T newPlayer = createNewPlayer(name);
        players.add(newPlayer);

        return players.size() - 1;
    }

    public boolean executeGameAction(int player, GameAction action) {
        return action.action().test(player);
    }

    public boolean printPlayer(int id) {
        System.out.println("Printing the player info");

        if(players.get(id) != null) {
            System.out.println(players.get(id));
        }

        return false;
    }

    public boolean quitGames(int player) {

        System.out.printf("Bye %s -> Quit a game", players.get(player).name());
        return true;
    }


}
