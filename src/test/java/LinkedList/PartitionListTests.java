package LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PartitionListTests {

  PartitionList partitionList;

  @Before
  public void setUp() {
    partitionList = new PartitionList();
  }

  @Test
  public void testPartitionList() {
    ListNode list = new ListNode(1);
    list.add(2).add(5).add(7).add(0).add(9);
    ListNode result = new ListNode(0);
    result.add(2).add(1).add(5).add(7).add(9);
    Assert.assertTrue(TestUtil.listEquals(partitionList.getPartitionedList(list, 5), result));
  }

}
