package lpa.pirate;

import lpa.dev.Game;
import lpa.dev.GameAction;

import java.util.*;

public class PirateGame extends Game<Pirate> {
    private static final List<List<String>> levelMap = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        // Level 1 Towns
        levelMap.add(List.of(
                "Bridgetown, Barbados",
                "Fitts Village, Barbados",
                "Holetown, Barbados"
        ));
        // Level 2 Towns
        levelMap.add(List.of(
                "Fort-de-France, Martinique",
                "Sainte-Anne, Martinique",
                "Le Vauclin, Martinique"
        ));
    }

    private final int currentLevel = 0;

    {
        this.gameActions.put(
                'W', new GameAction('W', "A current Weapon", this::currentWeapon)
        );

        this.gameActions.put(
                'H', new GameAction('H', "Hit the town", this::hitTown)
        );

        this.gameActions.put(
                'S', new GameAction('S', "Select a Weapon", this::selectWeapon)
        );

        this.gameActions.put(
                'A', new GameAction('A', "Print all Cities", this::printAllCities)
        );

        this.gameActions.put(
                'G', new GameAction('G', "Go to the city", this::goToCity)
        );

        this.gameActions.put(
                'V', new GameAction('V', "Press to print visited Towns", this::printVisitedTowns)
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
        return this.gameActions;
    }

    public boolean goToCity(int playerId) {
        if (players.get(playerId).getCurrentWeapon() != null) {
            System.out.println("First you need to select a weapon");
            return false;
        }

        System.out.println("Which city do you want to select?");
        var level = levelMap.get(currentLevel);

        for (int i = 0; i < level.size(); i++) {
            String city = level.get(i);
            System.out.printf("[%d]: %s \n", i, city);
        }

        int idCity = scanner.nextInt();
        players.get(playerId).getTownsVisited().add(level.get(idCity));

        System.out.println("Going to: " + level.get(idCity));
        return false;
    }

    public boolean printVisitedTowns(int playerId) {
        System.out.println("Printing");

        players.get(playerId).getTownsVisited().forEach(val -> {
            System.out.printf("City: %s", val);
        });

        return false;
    }

    public boolean printAllCities(int playerId) {
        for (int i = 0; i < levelMap.size(); i++) {
            System.out.printf("-=== Level %d ===- \n ", i + 1);
            System.out.println(levelMap.get(i));
        }

        return false;
    }

    public boolean currentWeapon(int playerId) {
        Weapon cuurentWeapon = players.get(playerId).getCurrentWeapon();
        System.out.println(cuurentWeapon);

        return false;
    }

    public boolean selectWeapon(int playerId) {
        EnumSet<Weapon> weapons = EnumSet.allOf(Weapon.class);

        weapons.forEach(weapon -> {
            System.out.printf("%d %s: [Damage: %d | Min level required: %d] \n", weapon.ordinal(), weapon.name(), weapon.hitPoints, weapon.minLevel);
        });

        int weaponId = scanner.nextInt();
        Weapon selectedWeapon = Weapon.values()[weaponId];
        players.get(playerId).setCurrentWeapon(selectedWeapon);

        System.out.println("Selected weapon: " + selectedWeapon.name());

        return false;
    }

    public boolean hitTown(int playerId) {
        List<String> cities = new ArrayList<>(players.get(playerId).getTownsVisited());
        String currentCity = cities.get(cities.size() - 1);



        return false;
    }
}
