import java.util.*;

class BFSShortestPath {

    public List<Integer> shortestPath(Map<Integer, List<Integer>> graph,
                                      int source,
                                      int destination) {

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> parent = new HashMap<>();

        queue.offer(source);
        visited.add(source);
        parent.put(source, null);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            if (current == destination)
                break;

            for (int neighbor : graph.getOrDefault(current, new ArrayList<>())) {

                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);
                    parent.put(neighbor, current);
                    queue.offer(neighbor);
                }
            }
        }

        if (!visited.contains(destination))
            return new ArrayList<>();

        LinkedList<Integer> path = new LinkedList<>();

        Integer node = destination;

        while (node != null) {
            path.addFirst(node);
            node = parent.get(node);
        }

        return path;
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3));
        graph.put(2, Arrays.asList(3));
        graph.put(3, Arrays.asList(4));

        BFSShortestPath obj = new BFSShortestPath();

        System.out.println(obj.shortestPath(graph, 0, 4));
    }
}