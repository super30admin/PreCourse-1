//Implement Stack using Linked List.
public class Exercise_2 {
	// Driver code
	public static void main(String[] args) {

		StackAsLinkedList sll = new StackAsLinkedList();

		sll.push(10);
		sll.push(20);
		sll.push(30);

		System.out.println(sll.pop() + " popped from stack");

		System.out.println("Top element is " + sll.peek());
	}
}

class StackAsLinkedList {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			// Constructor here
			this.data = data;
			this.next = null; // initially pointed to null

		}
	}

	StackNode top = null;

	public boolean isEmpty() {
		return top == null;
	}

	public void push(int data) {
		StackNode currNode = new StackNode(data);
		currNode.data = data;
		if (top == null) {
			top = currNode;
		} else {
			currNode.next = top;
			top = currNode;
		}

	}

	public int pop() {
		// If Stack Empty Return 0 and print "Stack Underflow"
		if (!isEmpty()) {
			StackNode currNode = top; // pointing currnode and head to same node
			top = top.next;
			currNode.next = null;
			return currNode.data; // pop element is returned

		} else {
			System.out.println("Stack is Empty");
			return 0;
		}
		// Write code to pop the topmost element of stack.
		// Also return the popped element
	}

	public int peek() {
		// Write code to just return the topmost element without removing it.
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return 0;
		}
	}
}


// Time Complexity 
// Push: O(1)
// Pop: O(1)
// Peek: O(1)
