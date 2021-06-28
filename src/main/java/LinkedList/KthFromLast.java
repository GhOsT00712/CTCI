package LinkedList;

/**
 * To find kth element from Last of the given list
 *
 * @Time : O(n)
 * @Space : O(1)
 */
public class KthFromLast {

  public ListNode getKthFromLast(ListNode root, int k) {
    ListNode fast = root;
    ListNode slow = root;
    while (k-- > 0) {
      assert fast != null;
      fast = fast.next;
    }
    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow;
  }
}
