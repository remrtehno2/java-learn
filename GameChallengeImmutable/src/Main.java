import lpa.dev.GameConsole;
import lpa.pirate.PirateGame;
import lpa.prod.MyOwnGame;

public class Main {
    public static void main(String[] args) {
        GameConsole<PirateGame> gameConsole = new GameConsole<>(new PirateGame());

        int idPlayer = gameConsole.addPlayer();
        gameConsole.playGame(idPlayer);
    }


    public static void mainCustomMain() {
        GameConsole<MyOwnGame> gameConsole = new GameConsole<>(new MyOwnGame());

        int idPlayer = gameConsole.addPlayer();
        gameConsole.playGame(idPlayer);
    }
}
