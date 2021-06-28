package LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KthFromLastTests {

  KthFromLast kthFromLast;

  @Before
  public void setUp() {
    kthFromLast = new KthFromLast();
  }

  @Test
  public void TestKthNodeFromLastCorrect() {
    ListNode root = TestUtil.createLinkedList();
    Assert.assertEquals(5, kthFromLast.getKthFromLast(root, 3).data);
  }

}
