package Arrays;

/**
 * Fill space with %20 in a given string
 * @Time :O(N)
 * @Space :O(N)
 */

public class URLify {

  public String Urlilfy(String s) {
    StringBuilder stringBuilder = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (c == ' ') {
        stringBuilder.append("%20");
      } else {
        stringBuilder.append(c);
      }
    }
    return stringBuilder.toString();
  }
}
