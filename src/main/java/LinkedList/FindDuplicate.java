package LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * Find a duplicate in a list
 *
 * @Time : O(N)
 * @Space : O(N)
 */
public class FindDuplicate {

  public ListNode removeDuplicates(ListNode root) {
    ListNode node = root;
    Set<Integer> set = new HashSet<>();
    ListNode prev = null;
    while (node != null) {
      if (set.contains(node.data)) {
        prev.next = node.next;
      } else {
        set.add(node.data);
        prev = node;
      }
      node = node.next;
    }
    return root;
  }
}
