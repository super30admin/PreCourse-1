class StackAsLinkedList {

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
		if (root == null) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int data) {
		// Write code to push data to the stack.
		StackNode newNode = new StackNode(data);
		if (root == null) {
			root = newNode;
		} else {
			StackNode temp = root;
			root = newNode;
			newNode.next = temp;
		}
	}

	public int pop() {
		// If Stack Empty Return 0 and print "Stack Underflow"
		// Write code to pop the topmost element of stack.
		// Also return the popped element

		int popped_element = Integer.MIN_VALUE;
		if (root == null) {
			System.out.println("Empty Stack!!!");
		} else {
			popped_element = root.data;
			root = root.next;
		}
		return popped_element;
	}

	public int peek() {
		// Write code to just return the topmost element without removing it.
		if (root == null) {
			System.out.println("Stack is Empty");
			return Integer.MIN_VALUE;
		} else {
			return root.data;
		}
	}
}

// Driver code
class Main_2 {
	public static void main(String[] args) {

		StackAsLinkedList sll = new StackAsLinkedList();

		sll.push(10);
		sll.push(20);
		sll.push(30);

		System.out.println(sll.pop() + " popped from stack");

		System.out.println("Top element is " + sll.peek());
	}
}
