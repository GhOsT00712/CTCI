package LinkedList;

/**
 * TO detect and return a node causing loop in List.
 *
 * @Time : O(N)
 * @Space : O(1)
 */
public class LoopDetect {

  public ListNode getLoopNode(ListNode root) {
    ListNode slow = root;
    ListNode fast = root;
    // move both pointer fast : 2x and slow : 1x speed
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      //detected loop
      if (slow == fast) {
        break;
      }
    }
    //to check if there is no loop
    if (fast == null || fast.next == null) {
      return null;
    }
    //move slow to head , move it with same speed and return when they again meets.
    slow = root;
    while (fast != slow) {
      fast = fast.next;
      slow = slow.next;
    }
    return slow;
  }
}
