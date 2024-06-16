package lpa.pirate;

import lpa.dev.interfaces.Player;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pirate implements Player {
    protected Map<String, Integer> gameData;
    private String name;
    private Set<String> townsVisited;
    private Weapon currentWeapon;

    public Pirate(String name) {
        this.name = name;
        this.townsVisited = new HashSet<>();
        this.gameData = new HashMap<>();
    }

    public Map<String, Integer> getGameData() {
        return gameData;
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
}
