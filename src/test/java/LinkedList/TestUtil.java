package LinkedList;

public class TestUtil {

  public static ListNode createLinkedListWithDups() {
    ListNode node = new ListNode(0);
    node.next = new ListNode(1);
    node.next.next = new ListNode(2);
    node.next.next.next = new ListNode(3);
    node.next.next.next.next = new ListNode(2);
    node.next.next.next.next.next = new ListNode(2);
    node.next.next.next.next.next.next = new ListNode(3);
    node.next.next.next.next.next.next.next = new ListNode(10);
    return node;
  }

  public static ListNode createLinkedList() {
    ListNode node = new ListNode(0);
    node.next = new ListNode(1);
    node.next.next = new ListNode(2);
    node.next.next.next = new ListNode(3);
    node.next.next.next.next = new ListNode(4);
    node.next.next.next.next.next = new ListNode(5);
    node.next.next.next.next.next.next = new ListNode(6);
    node.next.next.next.next.next.next.next = new ListNode(7);

    return node;
  }

  public static boolean listEquals(ListNode l1, ListNode l2) {
    while (l1 != null && l2 != null) {
      if (l1.data != l2.data) {
        return false;
      }
      l1 = l1.next;
      l2 = l2.next;
    }
    return l1 == null && l2 == null;
  }

}
