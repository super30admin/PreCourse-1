 class StackAsLinkedList {

  StackNode root, top, top_M1;

  static class StackNode {

    int data;
    StackNode next;

    StackNode(int data) {
      this.data = data;
      //Constructor here
    }
  }


  public boolean isEmpty() {
    return root == null;
    //Write your code here for the condition if stack is empty.
  }

  public void push(int data) {
    StackNode newNode = new StackNode(data);
    if (root == null) {
      root = newNode;
      top = newNode;
      return;
    }
    newNode.next = top;
    top = newNode;

    //Write code to push data to the stack.
  }

  public int pop() {
    if (root == null) {
      System.out.println("Stack Underflow");
      return 0;
    }
    int data = top.data;
    if (root == top) {
      root = null;
      top = null;
      return data;
    }
    top =top.next;
    return data;

    //If Stack Empty Return 0 and print "Stack Underflow"
    //Write code to pop the topmost element of stack.
    //Also return the popped element
  }

  public int peek() {
    if (root == null) {
      System.out.println("Stack Underflow");
      return 0;
    }
    return top.data;
    //Write code to just return the topmost element without removing it.
  }

  //Driver code
  public static void main(String[] args) {

    StackAsLinkedList sll = new StackAsLinkedList();

    sll.push(10);
    sll.push(20);
    sll.push(30);

    System.out.println(sll.pop() + " popped from stack");
    sll.push(40);
    System.out.println("Top element is " + sll.peek());
    System.out.println(sll.pop() + " popped from stack");
  }
}
