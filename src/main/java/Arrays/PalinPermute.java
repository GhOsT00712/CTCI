package Arrays;

/**
 * To determine if a string is a permutation of a palindrome.
 *
 * @Time : O(N)
 * @Space : O(1)
 */
public class PalinPermute {

  public boolean isPalinPermute(String s) {
    int[] freqVector = new int[128]; //ASCII charset
    for (char c : s.toCharArray()) {
      freqVector[c]++;
    }
    boolean oddPalinFlag = false;
    for (int i = 0; i < 128; i++) {
      if (freqVector[i] % 2 != 0) {
        if (oddPalinFlag) {
          return false;
        } else {
          oddPalinFlag = true;
        }
      }
    }
    return true;
  }
}
