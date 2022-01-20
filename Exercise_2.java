//Time complexity : O(1)

public class StackAsLinkedList {
  StackNode root;

  static class StackNode {
    int data;
    StackNode next;

    StackNode(int data)
    {
      //Constructor here
      this.data = data;
      this.next = null;
    }
  }

  public boolean isEmpty()
  {
    //Write your code here for the condition if stack is empty.
    return root == null;
  }

  public void push(int data)
  {
    //Write code to push data to the stack.
    StackNode p = new StackNode(data);
		p.next = root;
		root = p;
  }

  public int pop()
  {
    //If Stack Empty Return 0 and print "Stack Underflow"
    //Write code to pop the topmost element of stack.
    //Also return the popped element
    if (root == null) {
      System.out.println("Stack Underflow/Stack is empty");
      return 0;
    }	else {
		  int v = root.data;
		  root = root.next;
		  return v;
		}
  }

  public int peek()
  {
    //Write code to just return the topmost element without removing it.
    if (root == null)
      return -1;
		else{
			return root.data;
    }
  }

//Driver code
  public static void main(String[] args)
  {
    StackAsLinkedList sll = new StackAsLinkedList();
    sll.push(10);
    sll.push(20);
    sll.push(30);
    System.out.println(sll.pop() + " popped from stack");
    System.out.println("Top element is " + sll.peek());
  }
}