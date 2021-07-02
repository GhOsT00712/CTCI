package Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackGroupTests {

  StackGroup stackGroup ;

  @Before
  public  void  setUp(){
    stackGroup = new StackGroup(3,10);
  }

  @Test
  public  void testPush() throws Exception {
    stackGroup.push(10,2);
    stackGroup.push(11,2);
    Assert.assertEquals(stackGroup.pop(2),11);
  }
}
