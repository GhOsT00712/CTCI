package Stack;

import java.util.Stack;

/**
 * Implement a stack with a getMin API to get the minimum value in stack;
 */
public class MinStack extends Stack<Integer> {

  Stack<Integer> minStack;

  public MinStack() {
    minStack = new Stack<>();
  }

  public void push(int val) {
    if (minStack.isEmpty() || val <= getMin()) {
      minStack.push(val);
    }
    super.push(val);
  }

  public Integer pop() {
    int val = super.pop();
    if (val == getMin()) {
      minStack.pop();
    }
    return val;
  }

  public int getMin() {
    return minStack.peek();
  }
}
