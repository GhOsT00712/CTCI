package LinkedList;


/**
 * TO determine SUM of a number stored in list
 *
 * @Time : O(N)
 * @Space : O(1)
 */
public class SumNumber {

  public ListNode getSumFromReversedNumberList(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode();
    ListNode node = dummyHead;
    int carry = 0;

    while (l1 != null && l2 != null) {
      int sum = l1.data + l2.data + carry;
      node.next = new ListNode(sum % 10);
      carry = sum / 10;
      l1 = l1.next;
      l2 = l2.next;
      node = node.next;
    }
    while (l1 != null) {
      node.next = new ListNode(l1.data + carry);
      carry = 0;
      node = node.next;
      l1 = l1.next;
    }
    while (l2 != null) {
      node.next = new ListNode(l2.data + carry);
      carry = 0;
      node = node.next;
      l2 = l2.next;
    }
    if (carry > 0) {
      node.next = new ListNode(carry);
    }

    return dummyHead.next;
  }

  public ListNode getSUmFromNumberList(ListNode l1, ListNode l2) {
    int l1Len = findLen(l1);
    int l2Len = findLen(l2);
    int diff = Math.abs(l1Len - l2Len);

    if (l1Len > l2Len) {
      l2 = pad(l2, diff);
    } else if (l2Len > l1Len) {
      l1 = pad(l1, diff);
    }
    ListNode result = new ListNode();
    result = addListUtil(l1, l2, result);
    if (result.data > 0) {
      return result;
    } else {
      return result.next;
    }
  }

  private ListNode addListUtil(ListNode l1, ListNode l2, ListNode result) {
    if (l1 == null && l2 == null) {
      return result;
    }
    result = addListUtil(l1.next, l2.next, result);
    int sum = l1.data + l2.data + result.data;
    int carry = sum / 10;
    result.data = sum % 10;
    ListNode curr = new ListNode(carry);
    curr.next = result;
    result = curr;
    return result;
  }

  private ListNode pad(ListNode node, int diff) {
    while (diff > 0) {
      ListNode newNode = new ListNode(0);
      newNode.next = node;
      node = newNode;
      diff--;
    }
    return node;
  }

  private int findLen(ListNode l) {
    int count = 0;
    while (l != null) {
      l = l.next;
      count++;
    }
    return count;
  }

}
