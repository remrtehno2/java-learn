package lpa.prod;

import lpa.dev.interfaces.Player;

public class MyCustomPlayer implements Player {
    private String name;
    public MyCustomPlayer(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
