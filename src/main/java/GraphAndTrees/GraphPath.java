package GraphAndTrees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * To determine if path exist in graph
 */
public class GraphPath {

  public boolean isPathExist(HashMap<Integer, ArrayList<Integer>> graph, int v1, int v2) {
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(v1);
    while (!queue.isEmpty()) {
      int v = queue.poll();
      ArrayList<Integer> neighbours = graph.getOrDefault(v ,new ArrayList<>());
      for (int n : neighbours) {
        if (n == v2) {
          return true;
        }
        queue.offer(n);
      }
    }
    return false;
  }
}