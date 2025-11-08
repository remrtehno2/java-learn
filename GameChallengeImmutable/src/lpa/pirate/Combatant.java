package lpa.pirate;

import lpa.dev.interfaces.Player;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract sealed class Combatant implements Player permits Islander, Solider, Pirate {
    protected Map<String, Integer> gameData;
    private String name;
    private Weapon currentWeapon;

    public Combatant(String name) {
        this.name = name;
        this.gameData = new HashMap<>();
    }

    public Map<String, Integer> getGameData() {
        return gameData;
    }

    public String getName() {
        return name;
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
