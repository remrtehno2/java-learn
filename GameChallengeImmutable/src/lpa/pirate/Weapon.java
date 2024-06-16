package lpa.pirate;

public enum Weapon {
    AXE(1, 5),
    KNIFE(1, 10),
    MACHETE(3, 50);

    int minLevel;
    int hitPoints;

    Weapon(int minLevel, int hitPoints) {
        this.minLevel = minLevel;
        this.hitPoints = hitPoints;
    }
}
