import java.util.*;

class DFSAllPaths {

    public void findPaths(Map<Integer, List<Integer>> graph,
                          int current,
                          int destination,
                          List<Integer> path,
                          Set<Integer> visited,
                          List<List<Integer>> answer) {

        path.add(current);
        visited.add(current);

        if (current == destination) {

            answer.add(new ArrayList<>(path));

        } else {

            for (int neighbor : graph.getOrDefault(current, new ArrayList<>())) {

                if (!visited.contains(neighbor)) {

                    findPaths(graph, neighbor, destination,
                            path, visited, answer);
                }
            }
        }

        path.remove(path.size() - 1);
        visited.remove(current);
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3));
        graph.put(2, Arrays.asList(3));
        graph.put(3, Arrays.asList());

        DFSAllPaths obj = new DFSAllPaths();

        List<List<Integer>> answer = new ArrayList<>();

        obj.findPaths(graph, 0, 3,
                new ArrayList<>(),
                new HashSet<>(),
                answer);

        System.out.println(answer);
    }
}