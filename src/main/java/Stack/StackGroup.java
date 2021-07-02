package Stack;

/**
 * To create 3 stacks using a single array
 */
public class StackGroup {

  int stackNumbers;
  int stackCapacity;
  int[] arr;
  int[] size;

  public StackGroup(int stackNumbers, int stackCapacity) {
    this.stackNumbers = stackNumbers;
    this.stackCapacity = stackCapacity;
    arr = new int[stackCapacity * stackNumbers];
    size = new int[stackNumbers];
  }

  public void push(int val, int stackNumber) throws Exception {
    if (size[stackNumber] == stackCapacity) {
      throw new Exception("Stack is full");
    }
    size[stackNumber]++;
    arr[getStackIndex(stackNumber)] = val;


  }

  public int pop(int stackNumber) throws Exception {
    if (size[stackNumber] == 0) {
      throw new Exception("Stack is Empty");
    }
    int val = arr[getStackIndex(stackNumber)];
    arr[getStackIndex(stackNumber)] = 0;
    size[stackNumber]--;
    return val;
  }

  private int getStackIndex(int stackNumber) {
    int offset = stackNumber * stackCapacity;
    int index = size[stackNumber];
    return offset + index - 1;
  }
}
