package Stack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Implement arraysOfStack and implement push and pop operation .
 */
public class ArrayOfStack {

  ArrayList<Stack<Integer>> stacks;
  int capacity;

  public ArrayOfStack(int capacity) {
    stacks = new ArrayList<>();
    this.capacity = capacity;
  }

  public void push(int val) {
    Stack<Integer> lastStack = getLastStack();
    if (lastStack != null && !isStackFull(lastStack)) {
      lastStack.push(val);
    } else {
      Stack<Integer> s = new Stack();
      s.push(val);
      stacks.add(s);
    }
  }

  public int pop() {
    Stack<Integer> lastStack = getLastStack();
    if (lastStack != null) {
      int val = lastStack.pop();
      if (lastStack.size() == 0) {
        stacks.remove(lastStack);
      }

      return val;
    }
    return -1;
  }

  private boolean isStackFull(Stack<Integer> stack) {
    return stack.size() == capacity;
  }

  private Stack<Integer> getLastStack() {
    if (stacks.size() != 0) {
      return stacks.get(stacks.size() - 1);
    }
    return null;
  }
}
