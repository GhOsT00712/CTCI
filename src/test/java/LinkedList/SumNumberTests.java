package LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumNumberTests {

  SumNumber sumNumber;

  @Before
  public void setUp() {
    sumNumber = new SumNumber();
  }

  @Test
  public void testReverseCorrect() {
    ListNode l1 = new ListNode();
    l1.add(6).add(1).add(1);
    ListNode l2 = new ListNode();
    l2.add(7).add(5).add(1);
    ListNode result = new ListNode();
    result.add(3).add(7).add(2);
    Assert.assertTrue(
        TestUtil.listEquals(sumNumber.getSumFromReversedNumberList(l1.next, l2.next), result.next));
  }

  @Test
  public void testReverseCorrectWithCarry() {
    ListNode l3 = new ListNode();
    l3.add(9).add(9).add(9);
    ListNode l4 = new ListNode();
    l4.add(1).add(0).add(0);
    ListNode result = new ListNode();
    result.add(0).add(0).add(0).add(1);
    Assert.assertTrue(
        TestUtil.listEquals(sumNumber.getSumFromReversedNumberList(l3.next, l4.next), result.next));
  }

  @Test
  public void testReverseCorrectWithCarry2() {
    ListNode l3 = new ListNode();
    l3.add(9).add(9).add(9).add(6);
    ListNode l4 = new ListNode();
    l4.add(1).add(0).add(0);
    ListNode result = new ListNode();
    result.add(0).add(0).add(0).add(7);
    Assert.assertTrue(
        TestUtil.listEquals(sumNumber.getSumFromReversedNumberList(l3.next, l4.next), result.next));
  }

  @Test
  public void testCorrectSum() {
    ListNode l3 = new ListNode();
    l3.add(1).add(2).add(3).add(4);
    ListNode l4 = new ListNode();
    l4.add(1).add(2).add(0);
    ListNode result = new ListNode();
    result.add(1).add(3).add(5).add(4);
    Assert.assertTrue(
        TestUtil.listEquals(sumNumber.getSUmFromNumberList(l3.next, l4.next), result.next));
  }
  @Test
  public void testCorrectSumWithCarry() {
    ListNode l3 = new ListNode();
    l3.add(9).add(9).add(9).add(9);
    ListNode l4 = new ListNode();
    l4.add(1).add(2).add(0);
    ListNode result = new ListNode();
    result.add(1).add(0).add(1).add(1).add(9);
    Assert.assertTrue(
        TestUtil.listEquals(sumNumber.getSUmFromNumberList(l3.next, l4.next), result.next));
  }
}
