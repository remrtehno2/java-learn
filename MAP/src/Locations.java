import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Locations {
    public String nameOfLocations;
    public Map<String, String> directions = new HashMap<>();

    public Locations(String nameOfLocations, String directionsArgument) {
        this.nameOfLocations = nameOfLocations;

                                    /* "E:Lake, S: Hill" */
        String[] directionArray = directionsArgument.split(",");
        /*
                [E:Lake, S: Hill]
                   0         1
         */

        for(String directionElement : directionArray) {

            String[] splits = directionElement.trim().split(":");
        /*
                  [E,        Lake]
                   0         1
         */

                            // "S" -> "S"      " S" -> "S"     " Hill" -> "Hill"
            directions.put(splits[0].trim(), splits[1].trim());
        }
    }

    public void print() {
        System.out.println("You are here: " + nameOfLocations + "\n" + "From here, you can see:" );
        directions.forEach(
                (String key, String val) -> {
                    System.out.println(key + " - " + val);
                }
        );

        System.out.println();
    }

    public static void printMap(String key, String val) {
        System.out.println(key + " - " + val);
    }
}
