import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dijkstra {

    public static Map<String, Integer> dijkstra(Map<String, Map<String, Integer>> graph, String startNode) {
        Map<String, Integer> distances = new HashMap<>();
        for (String node : graph.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(startNode, 0);

        Set<String> visited = new HashSet<>();

        while (!visited.equals(graph.keySet())) {
            String node = distances.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
            visited.add(node);

            for (String neighbor : graph.get(node).keySet()) {
                int newDistance = distances.get(node) + graph.get(node).get(neighbor);
                if (newDistance < distances.get(neighbor)) {
                    distances.put(neighbor, newDistance);
                }
            }
        }

        return distances;
    }

    public static void main(String[] args) {
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        graph.put("A", new HashMap<String, Integer>() {{
            put("B", 5);
            put("C", 10);
        }});
        graph.put("B", new HashMap<String, Integer>() {{
            put("A", 5);
            put("C", 2);
            put("D", 1);
        }});
        graph.put("C", new HashMap<String, Integer>() {{
            put("A", 10);
            put("B", 2);
        }});
        graph.put("D", new HashMap<String, Integer>() {{
            put("B", 1);
        }});

        Map<String, Integer> distances = dijkstra(graph, "A");
        System.out.println(distances);
    }
}
