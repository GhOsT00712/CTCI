package Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayOfStackTests {

  ArrayOfStack arrayOfStack;

  @Before
  public void setUp() {
    arrayOfStack = new ArrayOfStack(3);
  }

  @Test
  public void TestArrayOfStacks() {
    arrayOfStack.push(10);
    arrayOfStack.push(21);
    arrayOfStack.push(22);
    arrayOfStack.push(40);
    Assert.assertEquals(arrayOfStack.pop(), 40);
    Assert.assertEquals(arrayOfStack.pop(), 22);
  }
}
