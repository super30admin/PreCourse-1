public class StackAsLinkedList {

	// root == top

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data = data;
		}
	}

	StackNode top;

	public boolean isEmpty() {
		// Write your code here for the condition if stack is empty.
		return top == null;
	}

	public void push(int data) {
		// Write code to push data to the stack.
		StackNode temp = new StackNode(data);

		if (temp == null) {
			return;
		}

		temp.data = data;
		temp.next = top;
		top = temp;

	}

	public int pop() {
		// If Stack Empty Return 0 and print "Stack Underflow"
		// Write code to pop the topmost element of stack.
		// Also return the popped element

		if (!isEmpty()) {
			System.out.println(top.data);
			// top = (top).next;
			int a = top.data;
			top = (top).next;
			return a;

		}

		else { // isEmpty condition
			System.out.print("Stack Underflow");
			return 0;
		}

	}

	public int peek() {
		// Write code to just return the topmost element without removing it.
		if (!isEmpty()) {

			return top.data;
		} else {
			return -1;
		}
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
