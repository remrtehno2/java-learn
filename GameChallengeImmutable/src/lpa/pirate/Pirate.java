package lpa.pirate;

import lpa.dev.interfaces.Player;

import java.util.*;

public final class Pirate extends Combatant {
    protected Map<String, Integer> gameData;
    private String name;
    private Set<String> townsVisited;
    private Weapon currentWeapon;

    public Pirate(String name) {
        super(name);
        this.name = name;
        this.townsVisited = new HashSet<>();
        this.gameData = new HashMap<>();

        this.gameData.put("level", 0);
    }


    public String getName() {
        return name;
    }

    public Set<String> getTownsVisited() {
        return townsVisited;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {

        var current = !townsVisited.isEmpty() ? new ArrayList<>(townsVisited).getLast() : null;

        return "---> " + current +
                "\nPirate "+ name + " " + gameData +
                "\n\ttownsVisited=" + current;
    }

}
