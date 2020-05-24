public class StackAsLinkedList {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		if (root == null) {
			return true;
		}
		return false;
	}

	public void push(int data) {
		// Write code to push data to the stack.
		StackNode n = new StackNode(data);
		if (root == null) {
			root = n;
		} else {
			n.next = root;
			root = n;
		}
	}

	public int pop() {
		// If Stack Empty Return 0 and print "Stack Underflow"
		// Write code to pop the topmost element of stack.
		// Also return the popped element
		StackNode s;
		if (root == null) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			s = root;
			root = root.next;
		}
		return s.data;
	}

	public int peek() {
		return root.data;
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
