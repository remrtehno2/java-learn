public class Monster implements Isaveable{

    public String name;

    public int hitPoints;

    public int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public String write() {
        return null;
    }

    @Override
    public void read(String arg1) {

    }
}
