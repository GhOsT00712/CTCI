package Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalinPermuteTests {

  PalinPermute palinPermute;

  @Before
  public void setUp() {
    palinPermute = new PalinPermute();
  }

  @Test
  public void testValid() {
    String str = "tactcoa";
    Assert.assertTrue(palinPermute.isPalinPermute(str));
  }
}
