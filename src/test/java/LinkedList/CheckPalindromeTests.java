package LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckPalindromeTests {

  CheckPalindrome checkPalindrome;

  @Before
  public void setUp() {
    checkPalindrome = new CheckPalindrome();
  }

  @Test
  public void TestForPalindromeList() {
    ListNode list = new ListNode(1);
    list.add(2).add(3).add(3).add(2).add(1);
    Assert.assertTrue(checkPalindrome.isPalindrome(list));
  }
  @Test
  public void TestForPalindromeList2() {
    ListNode list = new ListNode(1);
    list.add(2).add(3).add(2).add(1);
    Assert.assertTrue(checkPalindrome.isPalindrome(list));
  }
  @Test
  public void TestForPalindromeList3() {
    ListNode list = null;
    Assert.assertTrue(checkPalindrome.isPalindrome(list));
  }
}
