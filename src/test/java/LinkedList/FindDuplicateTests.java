package LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindDuplicateTests {

  FindDuplicate findDuplicate;

  @Before
  public void setUp() {
    findDuplicate = new FindDuplicate();
  }

  @Test
  public void removeDuplicateCorrect() {
    ListNode node = TestUtil.createLinkedListWithDups();
    ListNode newRoot = new ListNode(0);
    newRoot.add(1).add(2).add(3).add(10);
    Assert.assertTrue(TestUtil.listEquals(findDuplicate.removeDuplicates(node), newRoot));
  }

}
