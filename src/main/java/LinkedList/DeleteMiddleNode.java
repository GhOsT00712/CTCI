package LinkedList;

/**
 * Deletes a Middle Node form List.
 *
 * @Time : O(N)
 * @Space : O(1)
 */
public class DeleteMiddleNode {

  public ListNode deleteMiddleNode(ListNode root) {
    deleteNode(findMiddleNode(root), root);
    return root;
  }

  private ListNode findMiddleNode(ListNode root) {
    ListNode fast = root;
    ListNode slow = root;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    return slow;
  }

  private void deleteNode(ListNode middle, ListNode root) {
    ListNode dummyHead = new ListNode(-1);
    dummyHead.next = root;
    ListNode prev = dummyHead;
    while (root.data != middle.data) {
      prev = root;
      root = root.next;
    }
    prev.next = root.next;
  }


}
