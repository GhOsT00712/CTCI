package Arrays;

/**
 * To determine if string is all unique characters.
 *
 * @Time : O(C) ; C : Character set (ASCII) in this case.
 * @Space : O(1) ; Assumption: String is made of ASCII characters.
 */
public class IsUnique {

  public boolean isUniqueString(String s) {
    boolean[] freqVector = new boolean[128];
    for (char c : s.toCharArray()) {
      if (freqVector[c]) {
        return false;
      }
      freqVector[c] = true;
    }

    return true;
  }
}
