package Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CompressStringTests {

  CompressString compressString;

  @Before
  public void setUp() {
    compressString = new CompressString();
  }

  @Test
  public void testCompressStringCorrect() {
    Assert.assertEquals("a3b2c2d4a2", compressString.getCompressedString("aaabbccddddaa"));
  }

  @Test
  public void testCompressStringCorrect2() {
    Assert
        .assertEquals("aaazbbccddddaabcd", compressString.getCompressedString("aaazbbccddddaabcd"));
  }

}
