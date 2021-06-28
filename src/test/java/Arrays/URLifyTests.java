package Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class URLifyTests {

  URLify urLify;

  @Before
  public void setUp() {
    urLify = new URLify();
  }

  @Test
  public void testCorrect(){
    Assert.assertEquals("Hello%20my%20Name%20is%20Piyush!%20%20",urLify.Urlilfy("Hello my Name is Piyush!  "));
  }
}
