package SortingAndSearching;

import java.util.List;

/**
 * search a element from a list whose size is not given.
 *
 * @Time : O(Log N)
 * @Space : O(1)
 */
public class NoSizeSearch {

  public int searchNoSize(List<Integer> list, int x) {
    int left = 0;
    int right = getLengthUsingExponentialBackoff(list, x);
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (list.get(mid) == -1 || x < list.get(mid)) {
        right = mid - 1;
      } else if (x > list.get(mid)) {
        left = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  private int getLengthUsingExponentialBackoff(List<Integer> list, int x) {
    int i = 2;
    while (list.get(i) != -1 || list.get(i) > x) {
      i *= 2;
    }
    return i;
  }
}
