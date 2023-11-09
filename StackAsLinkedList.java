public class StackAsLinkedList {
	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			// Constructor here
			this.data = data;
		}
	}

	public boolean isEmpty() {
		// Write your code here for the condition if stack is empty.
		return this.root == null;
	}

	public void push(int data) {
		// Write code to push data to the stack.
		StackNode newNode = new StackNode(data);
		if (this.root == null) {
			this.root = newNode;
			return;
		}
		newNode.next = this.root;
		this.root = newNode;
		return;
	}

	public int pop() {
		// If Stack Empty Return 0 and print "Stack Underflow"
		// Write code to pop the topmost element of stack.
		// Also return the popped element
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		}
		
		int returnValu=this.root.data;
		this.root=this.root.next;
		return returnValu;
	}

	public int peek() {
		// Write code to just return the topmost element without removing it.
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		}
		int returnValu=this.root.data;
		return returnValu;
	}

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
