package LinkedList;

public class ListNode {

  int data;
  ListNode next;

  public ListNode() {

  }

  public ListNode(int data) {
    this.data = data;
  }

  public ListNode add(int data) {
    this.next = new ListNode(data);
    return this.next;
  }
}
