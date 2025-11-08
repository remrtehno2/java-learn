package lpa.pirate;

import java.util.*;

public record Town(
        String name,
        String island,
        int level,
        List<Loot> loot,
        List<Feature> features,
        List<Pirate> opponents) {

    public Town {
        loot = randomReduced(new ArrayList<>(EnumSet.allOf(Loot.class)), level);
        features = randomReduced(new ArrayList<>(EnumSet.allOf(Feature.class)), level);
    }


    public Town(String name ) {
        this(name, null, 1, null, null, null);
    }

    private <T> List<T> randomReduced(List<T> items, int size) {
        Collections.shuffle(items);
        return items.subList(0, getRandomValue(size) + 1);
    }

    static int getRandomValue(int bound) {
        if(bound < 0) {
            bound = 0;
        }
        return new Random().nextInt(bound);
    }
}