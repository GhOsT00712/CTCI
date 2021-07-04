package GraphAndTrees;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GraphPathTests {

  GraphPath graphPath;

  @Before
  public void setUp() {
    graphPath = new GraphPath();
  }

  @Test
  public void testFindGraphPathExists() {
    HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
    ArrayList<Integer> neighbours;
    neighbours = new ArrayList<>();
    neighbours.add(1);
    neighbours.add(2);
    graph.put(0, neighbours);
    neighbours.clear();
    neighbours.add(3);
    neighbours.add(2);
    graph.put(1, neighbours);

    Assert.assertTrue(graphPath.isPathExist(graph, 0, 3));
  }
  @Test
  public void testFindGraphPathExists2() {
    HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
    ArrayList<Integer> neighbours;
    neighbours = new ArrayList<>();
    neighbours.add(1);
    neighbours.add(2);
    graph.put(0, neighbours);
    neighbours.clear();
    neighbours.add(3);
    neighbours.add(2);
    graph.put(1, neighbours);

    Assert.assertFalse(graphPath.isPathExist(graph, 1, 0));
  }
}
