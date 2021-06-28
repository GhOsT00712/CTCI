package Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsUniqueTests {

  IsUnique isUnique;

  @Before
  public void setUp() {
    isUnique = new IsUnique();
  }

  @Test
  public void testIsUniqueTrue() {
    Assert.assertTrue(isUnique.isUniqueString("abcde"));
  }


  @Test
  public void testIsUniqueFalse() {
    Assert.assertFalse(isUnique.isUniqueString("abbcc"));
  }

  @Test
  public void testIsUniqueEmpty() {
    Assert.assertTrue(isUnique.isUniqueString(""));
  }
}
