package GraphAndTrees;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * To determine if a project can be build from given other project dependencies.
 */
class Pair {

  int key;
  int value;

  public int getKey() {
    return key;
  }

  public int getValue() {
    return value;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Pair(int key, int value) {
    this.key = key;
    this.value = value;
  }
}

public class ProjectDependency {

  public List<Integer> findBuildOrder(List<Integer> projects, List<Pair> dependencyPair) {
    List<Integer> projectBuildOrder = new ArrayList<>();
    if (dependencyPair.size() == 0) {
      for (int p : projects) {
        projectBuildOrder.add(p);
        return projectBuildOrder;
      }
    }
    Map<Integer, ArrayList<Integer>> graph = generateGraph(projects, dependencyPair);

    Set<Integer> visited = new HashSet<>();
    Set<Integer> visiting = new HashSet<>();
    for (int p : projects) {
      try{
        dfs(graph, visited, visiting, p, projectBuildOrder);
      }catch (Exception e){
        return new ArrayList<>();
      }
    }
    Collections.reverse(projectBuildOrder);
    return projectBuildOrder;
  }

  private void dfs(Map<Integer, ArrayList<Integer>> graph, Set<Integer> visited,
      Set<Integer> visiting, int p, List<Integer> projectBuildOrder)
      throws Exception {
    if (visiting.contains(p)) {
      throw new Exception("Cycle in graph");
    }
    if (visited.contains(p)) {
      return;
    }

    visiting.add(p);
    for (Integer neighbour : graph.get(p)) {
      dfs(graph, visited, visiting, neighbour, projectBuildOrder);
    }
    projectBuildOrder.add(p);
    visiting.remove(p);
    visited.add(p);
  }

  private Map<Integer, ArrayList<Integer>> generateGraph(List<Integer> projects,
      List<Pair> dependencyPair) {
    Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
    for (int p : projects) {
      graph.putIfAbsent(p, new ArrayList<>());
    }

    for (Pair pair : dependencyPair) {
      ArrayList<Integer> neighbours = graph.getOrDefault(pair.getValue(), new ArrayList<>());
      neighbours.add(pair.getKey());
      graph.put(pair.getValue(), neighbours);
    }
    return graph;
  }
}
