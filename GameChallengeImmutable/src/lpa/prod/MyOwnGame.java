package lpa.prod;

import lpa.dev.Game;
import lpa.dev.GameAction;

import java.util.Map;

public class MyOwnGame extends Game<MyCustomPlayer> {
    public MyOwnGame() {
        this.getGameActions().put('P', new GameAction('P', "Print Users info", this::printPlayer));
        this.getGameActions().put('Q', new GameAction('Q', "Press to Quit the game", this::quitGames));
    }

    public MyCustomPlayer createNewPlayer(String name) {
        return new MyCustomPlayer(name);
    }

    @Override
    public Map<Character, GameAction> getGameActions() {
        return this.gameActions;
    }
}
