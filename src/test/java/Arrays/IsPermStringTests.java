package Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsPermStringTests {

  IsPermString isPermString;

  @Before
  public void setUp() {
    isPermString = new IsPermString();
  }

  @Test
  public void testTrueCondition() {
    Assert.assertTrue(isPermString.isPermuteString("aavvxxx", "xaavxxv"));
  }
  @Test
  public void testTrueCondition2() {
    Assert.assertTrue(isPermString.isPermuteString("aacCxxx", "xaacxxC"));
  }

  @Test
  public void testFalseCondition() {
    Assert.assertFalse(isPermString.isPermuteString("aacCxxx", "xaAcxxC"));
  }
  @Test
  public void testEmptyCondition() {
    Assert.assertTrue(isPermString.isPermuteString("", ""));
  }
  @Test
  public void testEmptyCondition2() {
    Assert.assertFalse(isPermString.isPermuteString("aacCxxx", ""));
  }
}
