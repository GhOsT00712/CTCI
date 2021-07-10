package GraphAndTrees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PathSumTests {

  PathSum pathSum;

  @Before
  public void setUp() {
    pathSum = new PathSum();
  }

  @Test
  public void testPathSum() {
    TreeNode t = new TreeNode(5);
    t.left = new TreeNode(20);
    t.right = new TreeNode(10);
    t.left.left = new TreeNode(5);
    t.right.right = new TreeNode(10);
    t.right.right.right = new TreeNode(5);
    t.right.right.right.left = new TreeNode(5);
    Assert.assertEquals(4, pathSum.getPathSumCounts(t, 25));
  }
}
