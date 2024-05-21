import java.util.*;

public class Challenge2 {
    private static final String GAME_LOCATIONS = """
            Road | W: Hill, E:Well house,S:Valley,N:Forest
            Hill | N:Forest, E:Road
            Well house | W:Road,N:Lake,S:Stream
            Valley | N:Road,W:hill,E:stream
            Forest | S:road,E:lake
            Lake | W:Forest,S:well house
            Stream | W:Valley, N:Well house
            """;

    public static void main(String[] args) {
        Map<String, Locations> temp = new HashMap<>();


        for(String line : GAME_LOCATIONS.split("\n")) {
            // "road | W: hill, E:well house,S:valley,N:forest"
            String[] splits = line.split("\\|");

            String key = splits[0].trim();
            String value = splits[1].trim();

            var newLocation = new Locations(key, value);
            temp.put(key, newLocation);
        }

//        Locations forest = new Locations("Forest", "E:Lake, S: Hill");
//        Locations lake = new Locations("Lake", "E:Road, S: Lake");
//        Locations hill = new Locations("Hill", "E:Valley, N:Forest");
//        Locations valley = new Locations("Valley", "W: Hill, E:Stream");
//        Locations wellHouse = new Locations("Well House", "N:Lake, S:Stream");
//        Locations road = new Locations("Road", "N:Forest, S:Valley, E:Well house, W:Hill");
//        Locations stream = new Locations("Stream", "N:Well house, W:Valley");
//
//
//
//        temp.put("Forest", forest);
//        temp.put("Lake", lake);
//        temp.put("Hill", hill);
//        temp.put("Valley", valley);
//        temp.put("Well House", wellHouse);
//        temp.put("Road", road);
//        temp.put("Stream", stream);

        Locations currentLocation = temp.get("Road");

        Scanner scanner = new Scanner(System.in);

        currentLocation.print();

        while (true) {
            String direction = scanner.nextLine().trim().toUpperCase().substring(0, 1);
            if (direction.equals("Q")) break;

            if("NSEW".contains(direction)) {
                String selectedNameOfLocation = currentLocation.directions.get(direction);

                if(selectedNameOfLocation != null) {
                    currentLocation = temp.get(selectedNameOfLocation);
                    currentLocation.print();
                }
            } else {
                System.out.println("Entered wrong letter");
            }
        }

//        do{
//            currentLocation.print();
//
//            currentKey = scanner.next().charAt(0);
//        } while (currentKey != 'q');



//        forest.moveFurther("E");

//        Map<String, List<String>> mapArray = new HashMap<>();
//        mapArray.put("Test", List.of("test", "argon"));


        /*
        1) "E:Lake, S: Hill" - String
        2) ["E:Lake", "S: Hill"] - String[]

        3) for() {
                ["E", "Lake"]
                ["s", "Hill"]
                  0     1
                 putMap(0, 1)
            }

         */
    }
}
