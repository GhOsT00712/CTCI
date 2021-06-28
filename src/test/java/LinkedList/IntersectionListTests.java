package LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectionListTests {

  IntersectionList intersectionList;

  @Before
  public void setUp() {
    intersectionList = new IntersectionList();
  }

  @Test
  public void testListIntersection() {
    ListNode list = new ListNode(1);
    list.add(2).add(3).add(4).add(5);

    ListNode list2 = new ListNode(20);
    list2.add(30).add(23);

    ListNode list1Ref = list;
    while (list1Ref.data != 3) {
      list1Ref = list1Ref.next;
    }

    ListNode list2Ref = list2;
    while (list2Ref.data != 23) {
      list2Ref = list2Ref.next;
    }

    list2Ref.next = list1Ref;

    ListNode intersectingNode = intersectionList.getIntersectingNode(list, list2);
    Assert.assertEquals(3, intersectingNode.data);
  }

}
