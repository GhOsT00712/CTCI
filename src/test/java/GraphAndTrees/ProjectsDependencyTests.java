package GraphAndTrees;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProjectsDependencyTests {

  ProjectDependency projectDependencyObj;

  @Before
  public void setUp() {
    projectDependencyObj = new ProjectDependency();
  }

  @Test
  public void testProjectDependency() {
    List<Integer> projects = new ArrayList<>();
    projects.add(1);
    projects.add(2);
    projects.add(3);
    projects.add(4);
    projects.add(5);
    projects.add(6);
    List<Pair> projectDependency = new ArrayList<>();
    projectDependency.add(new Pair(1, 4));
    projectDependency.add(new Pair(6, 2));
    projectDependency.add(new Pair(2, 4));
    projectDependency.add(new Pair(6, 1));
    projectDependency.add(new Pair(4, 3));

    List<Integer> projectBuildOrder = new ArrayList<>();
    projectBuildOrder.add(5);
    projectBuildOrder.add(3);
    projectBuildOrder.add(4);
    projectBuildOrder.add(2);
    projectBuildOrder.add(1);
    projectBuildOrder.add(6);

    Assert.assertEquals(projectBuildOrder,projectDependencyObj.findBuildOrder(projects, projectDependency)
        );

  }

}
