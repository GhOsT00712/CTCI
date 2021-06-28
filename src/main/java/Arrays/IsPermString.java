package Arrays;

/**
 * To determine is a string is permutation of other.
 *
 * @Time : O(N);
 * @Space : O(1)
 */
public class IsPermString {

  /**
   * @param s1 : string one
   * @param s2 : Is permutation of S1 string
   * @return true if S2 is permutation of S1
   */
  public boolean isPermuteString(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    int[] freqVector = new int[128];
    for (char c : s1.toCharArray()) {
      freqVector[c]++;
    }
    for (char c : s2.toCharArray()) {
      freqVector[c]--;
    }
    for (int i = 0; i < 128; i++) {
      if (freqVector[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
