package Arrays;

/**
 * To find if rotated string is substring of a given string
 *
 * @Time : O(n)
 * @Space : O(1)
 */
public class StringRotation {

  public boolean isRotatedSubstr(String s1, String p) {
    if (s1.length() != p.length() || s1.length() == 0) {
      return false;
    }
    //concatenate string
    String sNew = s1 + s1;

    return sNew.contains(p);
  }
}
