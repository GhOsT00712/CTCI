package Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueViaStackTests {

  QueueViaStacks queue;

  @Before
  public void setUp() {
    queue = new QueueViaStacks();
  }

  @Test
  public void testsQueueViStacks() throws Exception {
    queue.offer(10);
    queue.offer(20);
    Assert.assertEquals(queue.poll(), 10);
  }
}
