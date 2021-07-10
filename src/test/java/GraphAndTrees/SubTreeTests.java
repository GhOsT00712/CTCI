package GraphAndTrees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubTreeTests {

  SubTree subTree;

  @Before
  public void setUp() {
    subTree = new SubTree();
  }

  @Test
  public void TestisSubTree() {
    TreeNode t1 = new TreeNode(1);
    t1.left = new TreeNode(2);
    t1.right = new TreeNode(3);
    t1.left.left = new TreeNode(4);
    t1.left.right = new TreeNode(5);
    TreeNode t2 = new TreeNode(2);
    t2.left = new TreeNode(4);
    t2.right = new TreeNode(5);

    Assert.assertTrue(subTree.isSubTree(t1, t2));
  }
}
