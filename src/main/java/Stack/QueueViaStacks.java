package Stack;

import java.util.Stack;

/**
 * Implement a queue using 2 stacks
 */
public class QueueViaStacks {

  Stack<Integer> stack1;
  Stack<Integer> stack2;

  public QueueViaStacks() {
    stack1 = new Stack<>();
    stack2 = new Stack<>();
  }

  public void offer(int val) {
    stack1.push(val);
  }

  public int poll() throws Exception {
    while (!stack1.isEmpty()) {
      stack2.push(stack1.pop());
    }
    if (stack2.size() == 0) {
      throw new Exception("Empty Queue");
    }
    return stack2.pop();
  }
}
