package lpa.dev;

import java.util.function.Predicate;

public record GameAction(char key, String prompt, Predicate<Integer> action) {

    @Override
    public String toString() {
        return key + " - " + prompt;
    }
}
