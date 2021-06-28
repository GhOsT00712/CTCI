package LinkedList;

/**
 * To determine if given list is a palindrome.
 *
 * @Time :O(N)
 * @Space : O(1);
 */
public class CheckPalindrome {

  public boolean isPalindrome(ListNode node) {
    //traverse list to half;
    ListNode slow = node;
    ListNode fast = node;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    //reverse the second half and check;
    ListNode temp = reverseList(slow);
    return checkListEqual(node, temp);

  }

  private boolean checkListEqual(ListNode node, ListNode node2) {
    while (node2 != null) {
      if (node.data != node2.data) {
        return false;
      }
      node = node.next;
      node2 = node2.next;
    }
    return true;
  }

  private ListNode reverseList(ListNode node) {
    ListNode prev = null;
    ListNode curr = node;

    while (curr != null) {
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }
}
