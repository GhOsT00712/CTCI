package LinkedList;

/**
 * To determine if tow list are intersection by ref.
 *
 * @Time : O(N)
 * @Space : O(1)
 */
public class IntersectionList {

  public ListNode getIntersectingNode(ListNode l1, ListNode l2) {
    //find length
    int l1Len = getLength(l1);
    int l2Len = getLength(l2);
    int diff = Math.abs(l1Len - l2Len);

    //traverse larger list
    if (l1Len > l2Len) {
      l1 = traverseList(l1, diff);
    } else if (l2Len > l1Len) {
      l2 = traverseList(l2, diff);
    }

    //traverse both list and return if intersecting
    while (l1 != null && l2 != null) {
      if (l1 == l2) {
        return l1;
      }
      l1 = l1.next;
      l2 = l2.next;
    }
    return null;


  }

  private ListNode traverseList(ListNode list, int diff) {
    while (diff-- > 0) {
      list = list.next;
    }
    return list;
  }

  private int getLength(ListNode list) {
    int len = 0;
    while (list != null) {
      len++;
      list = list.next;
    }
    return len;
  }
}
