package Arrays;

/**
 * To determine of two given strings are atmost one-edit distance apart.
 *
 * @Time : O(n)
 * @Space : O(1)
 */
public class OneEdit {

  public boolean isOneEdit(String s1, String s2) {
    if (Math.abs(s1.length() - s2.length()) > 1) {
      return false;
    }
    s1 = s1.length() < s2.length() ? s1 : s2;
    s2 = s1.length() < s2.length() ? s2 : s1;

    int idx1 = 0;
    int idx2 = 0;
    int diff = 0;
    while (idx1 < s1.length() && idx2 < s2.length()) {
      if (s1.charAt(idx1) != s2.charAt(idx2)) {
        if (s1.length() != s2.length()) {
          idx2++;
        }
        diff++;
        if (diff > 1) {
          return false;
        }
      }
      idx1++;
      idx2++;
    }
    return true;
  }
}
