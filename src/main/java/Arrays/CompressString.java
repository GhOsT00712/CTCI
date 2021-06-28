package Arrays;

/**
 * To determine compress string from given string on basis of character count. If compressed string
 * > original string than return original string
 *
 * @Time : O(N)
 * @Space : O(1)
 */
public class CompressString {

  public String getCompressedString(String s) {
    int charCount = 0;
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      charCount++;
      if (i + 1 >= s.length() || s.charAt(i + 1) != s.charAt(i)) {
        stringBuilder.append(s.charAt(i)).append(charCount);
        charCount = 0;
      }
    }
    return stringBuilder.length() >= s.length() ? s : stringBuilder.toString();
  }
}
