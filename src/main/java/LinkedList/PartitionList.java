package LinkedList;

/**
 * To partition list based on sentinel value
 *
 * @Time : O(N)
 * @Space : O(1)
 */
public class PartitionList {

  public ListNode getPartitionedList(ListNode node, int val) {
    ListNode head = node;
    ListNode tail = node;

    while (node != null) {
      ListNode next = node.next;
      if (node.data < val) {
        node.next = head;
        head = node;
      } else {
        tail.next = node;
        tail = tail.next;
      }
      node = next;
    }
    tail.next = null;
    return head;
  }

}
