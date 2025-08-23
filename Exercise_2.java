// Time Complexity : O(1) for all operations. push & pop - just reassigning a pointer
// Space Complexity : O(n) where n number of nodes
// Any problem you faced while coding this : no

class StackAsLinkedList {

  StackNode root;

  static class StackNode {

    int data; // the actual value stored
    StackNode next; // pointer to the next node

    StackNode(int data) {
      this.data = data;
      this.next = null;
    }
  }


  public boolean isEmpty() {
    return this.root == null;
  }

  public void push(int data) {
    StackNode newNode = new StackNode(data); // create new node with data
    newNode.next = this.root; // point new node to current root
    this.root = newNode; // make new node the new root
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("Stack Underflow");
      return 0;
    }

    int res = root.data; // get data from top node
    root = root.next; // move root to next node

    return res; // return the popped data
  }

  public int peek() {
    if (isEmpty()) {
      System.out.println("Stack Underflow");
      return 0;
    }

    return root.data;
  }

  //Driver code
  public static void main(String[] args) {

    StackAsLinkedList sll = new StackAsLinkedList();

    sll.push(10);
    sll.push(20);
    sll.push(30);

    System.out.println(sll.pop() + " popped from stack");

    System.out.println("Top element is " + sll.peek());
  }
}
