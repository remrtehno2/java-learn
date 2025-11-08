import java.util.*;

public class Main {
    public static void main(String[] args) {
        "s".replaceAll("a", "-");

        new StringBuilder("ABA").reverse()

        var t = new LinkedList<>();
        t.add(1);

        List<Integer> arr = new ArrayList<>(List.of(1, 3, 6));
        System.out.println(countElemInList(arr));
        System.out.println(count(arr));
        System.out.println(findTheBiggest(arr));

        System.out.println("Selection Sort: " + selectionSort(new ArrayList<>(List.of(10, 2, 99, 88888, 3, 6))));

        System.out.println("BFS: " + bsf(Map.of(
                "you", List.of("alice", "bob", "claire"),
                "bob", List.of("anuj", "peggy"),
                "alice", List.of("peggy"),
                "claire", List.of("thom", "jonny"),
                "anuj", List.of(),
                "peggy", List.of(),
                "thom", List.of(),
                "jonny", List.of()
        ), "you"));

        System.out.println("Dejikstra: " + dejikstra(
                Map.of(
                        "start", Map.of(
                                "A", 6,
                                "B", 2
                        ),
                        "A", Map.of(
                                "fin", 1
                        ),
                        "B", Map.of(
                                "A", 3,
                                "fin", 5
                        ),
                        "fin", Map.of()
                )
                , "start"));


        System.out.println("Greedy & an approximation algorithm: " + greedyNPApproximation(
                new HashMap<>(Map.of(
                        "kone", Set.of("id", "nv", "ut"),
                        "ktwo", Set.of("wa", "id", "mt"),
                        "kthree", Set.of("or", "nv", "ca"),
                        "kfour", Set.of("nv", "ut"),
                        "kfive", Set.of("ca", "az")
                )),
                new HashSet<>(Set.of("mt", "wa", "or", "id", "nv", "ut", "ca", "az"))
        ));
    }

    public static int countElemInList(List<Integer> listArg) {
        var list = new ArrayList<>(listArg);

        if (list.size() == 1) {
            return list.getFirst();
        }
        int first = list.getFirst();
        list.removeFirst();

        return first + countElemInList(list);
    }

    public static int count(List<Integer> listArg) {
        var list = new ArrayList<>(listArg);

        if (list.isEmpty()) {
            return 0;
        }
        list.removeFirst();

        return 1 + count(list);
    }

    public static int findTheBiggest(List<Integer> listArg) {
        var list = new ArrayList<>(listArg);

        if (list.size() == 1) {
            return list.getFirst();
        }
        int first = list.getFirst();
        list.removeFirst();
        int submax = findTheBiggest(list);

        return first < submax ? submax : first;
    }


    ///////////////////////////////
    public static int smallest(List<Integer> list) {
        int smallest = list.get(0);
        int smallestIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallestIndex = i;
                smallest = list.get(i);
            }
        }
        return smallestIndex;
    }

    public static List<Integer> selectionSort(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        var length = list.size();

        for (int i = 0; i < length; i++) {
            int smallest = smallest(list);

            newList.add(list.remove(smallest));
        }
        return newList;
    }


    // BFS
    public static boolean personIsSeller(String name) {
        return name.equals("peggy");
    }

    public static boolean bsf(Map<String, List<String>> graph, String name) {
        LinkedList<String> searchQueue = new LinkedList<>();

        // Queue<String> searchQueue = new LinkedList<>(graph.get(name));
        // searchQueue.addAll(graph.get(name));

        graph.get(name).forEach(searchQueue::add);
        Set<String> searched = new HashSet<>();

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();
            if (!searched.contains(person)) {
                if (personIsSeller(person)) {
                    System.out.println("Seller is found: " + person);
                    return true;
                } else {
                    for (String s : graph.get(person)) {
                        searchQueue.add(s);
                    }
                    searched.add(person);
                }
            }
        }
        return false;
    }

    // Dijkstra
    public static int dejikstra(Map<String, Map<String, Integer>> graph, String start) {
        Map<String, Integer> costs = new HashMap<>();
        Map<String, String> parents = new HashMap<>();
        Set<String> processed = new HashSet<>();


        /***** INIT BLOCK *****/
        // SET COSTS
        Map<String, Integer> startPoint = graph.get(start);
        costs.putAll(startPoint);
        costs.put("fin", Integer.MAX_VALUE); // INFINITY

        // SET PARENTS
        costs.forEach((k, v) -> {
            parents.put(k, start);
        });
        parents.put("fin", null);
        /***** END INIT BLOCK *****/

        var node = findLowestCostNode(costs, processed);
        System.out.println("Node: " + node);
        while (node != null) {
            var cost = costs.get(node);
            var neighbors = graph.get(node);

            for (int i = 0; i < neighbors.size(); i++) {
                var key = new ArrayList<>(neighbors.keySet()).get(i);
                var value = neighbors.get(key);
                var newCost = cost + value;

                if (newCost < costs.get(key)) {
                    costs.put(key, newCost);
                    parents.put(key, node);
                }
            }
            processed.add(node);
            node = findLowestCostNode(costs, processed);
        }

        System.out.println("Parents: " + parents);
        System.out.println("Costs: " + costs);

        return 1;
    }

    public static String findLowestCostNode2(Map<String, Integer> costs, Set<String> processed) {
        final int[] lowestCost = {(int) Math.abs(Double.POSITIVE_INFINITY)};
        final String[] lowestCostNode = {null};


        costs.forEach((key, value) -> {
            int cost = value;
            if (cost < lowestCost[0] && !processed.contains(key)) {
                lowestCost[0] = cost;
                lowestCostNode[0] = key;
            }
        });

        return lowestCostNode[0];
    }

    public static String findLowestCostNode(Map<String, Integer> costs, Set<String> processed) {
        int lowestCost = Integer.MAX_VALUE;
        String lowestCostNode = null;

        for (String node : costs.keySet()) {
            int cost = costs.get(node);

            if (cost < lowestCost && !processed.contains(node)) {
                lowestCost = cost;
                lowestCostNode = node;
            }
        }

        return lowestCostNode;
    }


    // GREEDY ALGORITHMS
    public static Set<String> greedyNPApproximation(Map<String, Set<String>> stations, Set<String> statesNeeded) {
        Set<String> finalStations = new HashSet<>();

        while (!statesNeeded.isEmpty()) {
            String bestStation = null;
            Set<String> statesCovered = new HashSet<>();

            for (var station : stations.keySet()) {
                var statesForStation = stations.get(station);

                Set<String> covered = new HashSet<>(statesNeeded);
                covered.retainAll(statesForStation);

                if(covered.size() > statesCovered.size()) {
                    bestStation = station;
                    statesCovered = covered;
                }
            }

            statesNeeded.removeAll(statesCovered);
            finalStations.add(bestStation);
        }


        return finalStations;
    }
}