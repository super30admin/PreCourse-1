// Java program to Implement a stack
// using singly linked list
// import package
import static java.lang.System.exit;

// Create Stack Using Linked list
class StackUsingLinkedlist {

	private class Node {

		int data; // integer data
		Node link; // reference variable Node type
	}
	Node top;
	// Constructor
	StackUsingLinkedlist()
	{
		this.top = null;
	}

	public void push(int x) // insert at the beginning
	{
		Node temp = new Node();
		if (temp == null) {
			return;
		}
		temp.data = x;

		temp.link = top;

		top = temp;
	}

	public boolean isEmpty()
	{
		return top == null;
	}

	public int peek()
	{
		// check for empty stack
		if (!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void pop() // remove at the beginning
	{
		// check for stack underflow
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		// update the top pointer to point to the next node
		top = (top).link;
	}

}

