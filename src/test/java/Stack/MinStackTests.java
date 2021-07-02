package Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinStackTests {

  MinStack minStack;

  @Before
  public void setUp() {
    minStack = new MinStack();
    minStack.push(10);
    minStack.push(45);
    minStack.push(5);
    minStack.push(3);
    minStack.push(7);
    minStack.push(9);
  }

  @Test
  public void testMinStack() {
    Assert.assertEquals(minStack.getMin(), 3);
  }

  @Test
  public void testMinStack2() {
    minStack.pop();
    minStack.pop();
    minStack.pop();
    Assert.assertEquals(minStack.getMin(), 5);
  }
}
