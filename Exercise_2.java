// Time Complexity : O(1)
// Space Complexity : O(n)

public class StackAsLinkedList {

	StackNode root;
	// New data member to keep track of last element, pointer to current/last element
	StackNode curr;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			// Constructor here
			// Initialize a new node with data when constructor is called
			this.data = data;
		}
	}

	public boolean isEmpty() {
		// Write your code here for the condition if stack is empty.
		return root == null;
	}

	public void push(int data) {
		// Write code to push data to the stack.
		// If empty, root is initialized with new node. Else, attach new node to current
		// element
		if (isEmpty()) {
			root = new StackNode(data);
			curr = root;
		} else {
			curr.next = new StackNode(data);
			curr = curr.next;
		}
	}

	public int pop() {
		// If Stack Empty Return 0 and print "Stack Underflow"
		// Write code to pop the topmost element of stack.
		// Also return the popped element
		curr = root;
		StackNode prev = curr;

		if (!isEmpty()) {
			while (curr.next != null) {
				prev = curr;
				curr = curr.next;
			}

			int val = curr.data;
			prev.next = null;

			if (curr != root) {
				curr = prev;
			} else {
				curr = null;
			}

			return val;
		}

		System.out.println("Stack Underflow");
		return 0;
	}

	public int peek() {
		// Write code to just return the topmost element without removing it.
		return curr != null ? curr.data : 0;
	}

	// Driver code
	public static void main(String[] args) {

		StackAsLinkedList sll = new StackAsLinkedList();

		sll.push(10);
		sll.push(20);
		sll.push(30);

		System.out.println(sll.pop() + " popped from stack");
		sll.pop();
		sll.pop();

		System.out.println("Top element is " + sll.peek());
	}
}
