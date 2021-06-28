package LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeleteMiddleNodeTests {

  DeleteMiddleNode deleteMiddleNode;

  @Before
  public void setUp() {
    deleteMiddleNode = new DeleteMiddleNode();
  }

  @Test
  public void deleteMiddleNodeCorrect() {
    ListNode root = new ListNode(0);
    root.add(1).add(2).add(3).add(4);
    ListNode newRoot = new ListNode(0);
    newRoot.add(1).add(3).add(4);
    Assert.assertTrue(TestUtil.listEquals(deleteMiddleNode.deleteMiddleNode(root), newRoot));
  }

}
