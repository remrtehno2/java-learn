import lpa.dev.GameConsole;
import lpa.prod.MyOwnGame;

public class Main {
    public static void main(String[] args) {
        GameConsole<MyOwnGame> gameConsole = new GameConsole<>(new MyOwnGame());

        int idPlayer = gameConsole.addPlayer();
        gameConsole.playGame(idPlayer);
    }
}
