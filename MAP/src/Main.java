import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();


        map.put("Author 1", "Letter 1");
        map.put("Author 2", "Letter 2");
        map.put("Author 3", "Letter 3");
        map.put("Author 3", "Letter 3 Modified");

        // Renders
        System.out.println(map);
        map.forEach( (String key, String val) -> {
            // System.out.println("Key:" + key + " value: " + val);
            System.out.printf("Key: %s = Value: %s \n", key, val);
        } );

        // 1
        System.out.println("Is the key existed? " + map.containsKey("Author 1"));

        // 2
        map.remove("Author 1");
        System.out.println("Is Author 1 existed? " + map.containsKey("Author 1"));

        // 3
        System.out.println(map.get("Author 2"));

        // 4
        System.out.println(map.getOrDefault("Author 2", "Author 1 new"));
        System.out.println(map.getOrDefault("Author 1", "Author 1 new"));

        // 5
        System.out.println(map);
        map.putIfAbsent("Author 1", "List 1");
        map.putIfAbsent("Author 2", "new List 2");
        System.out.println(map);

        // 5 MERGE
        Map<String, Integer> map2 = new HashMap<>();

        map2.merge("a", 2, (oldValue, newValue) -> {
            return oldValue + newValue;
        });
        map2.merge("a", 20, (oldValue, newValue) -> {
            return oldValue + newValue;
        });

        System.out.println(map2);

        // 6
        map2.compute("a", (k, v) -> v * 2);
//        map2.compute("c", (k, v) -> v * 2);
        System.out.println(map2);

        // 7
        map2.computeIfAbsent("a", k -> 10);
        map2.computeIfAbsent("z", k -> 10);
        System.out.println(map2);

        // 8
        map2.computeIfPresent("a", (kXXXX1, vW1) -> vW1 * 2);
        System.out.println(map2);

        // 9
        map2.replaceAll( (k, v) -> v * 2 );
        System.out.println(map2);

        // 10
        map2.replace("a", 2);
        System.out.println(map2);

        // 11 *******************************
        Set<String> keySet = map2.keySet();
        System.out.println(keySet);

        // 12
        Collection<Integer> values = map2.values();
        System.out.println(values);

        // 13
        Set<String> set1 = new HashSet<>(List.of("a", "b", "c"));
        Set<String> set2 = new HashSet<>(List.of("b", "c", "d"));
        set1.retainAll(set2);
        System.out.println(set1);

        // 14
        System.out.println(map.size());


        // 15
        Set<Map.Entry<String, Integer>> entrySet = map2.entrySet(); // Retrieves a set of key-value mappings in the map

        for (Map.Entry<String, Integer> entry : entrySet) {

            String key = entry.getKey(); // Retrieves the key of the current entry
            Integer value = entry.getValue(); // Retrieves the value of the current entry
            entry.setValue(12);

            System.out.println(key + " = " + value);
        }
        System.out.println(map2);

//        map2.forEach(() -> {
//
//        });

//        for(var t : map2) {
//
//        }
    }
}