package Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OneEditTests {

  OneEdit oneEdit;

  @Before
  public void setUp() {
    oneEdit = new OneEdit();
  }

  @Test
  public void testOneEditCorrect() {
    Assert.assertTrue(oneEdit.isOneEdit("Hello", "ello"));
  }

  @Test
  public void testOneEditCorrect2() {
    Assert.assertTrue(oneEdit.isOneEdit("Hello", "Hello"));
  }

  @Test
  public void testOneEditCorrect3() {
    Assert.assertTrue(oneEdit.isOneEdit("Hello", "Hell"));
  }

  @Test
  public void testOneEditCorrect4() {
    Assert.assertTrue(oneEdit.isOneEdit("Dello", "Hello"));
  }
}
