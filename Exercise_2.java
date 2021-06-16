// Time Complexity : O(1) for all operations
// Space Complexity : O(n) -> n is the maximum stack size
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : Took some time coming up with the logic

// Your code here along with comments explaining your approach

public class Exercise_2 {
	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			// Initialize node
			this.data = data;
			this.next = null;
		}
	}

	public Exercise_2() {
		// Initialize root (top) to null
		this.root = null;
	}

	public boolean isEmpty() {
		// Stack is empty is the root (top) is null
		return this.root == null;
	}

	public void push(int data) {
		StackNode newNode = new StackNode(data);

		// Add the node to beginning of the linked list, so that that is now the root (top)
		newNode.next = this.root;
		this.root = newNode;
	}

	public int pop() {
		// Stack underflow, if the root (top) is already null
		if (this.root == null) {
			System.out.println("Stack Underflow");
			return 0;
		}
		// Set the top to the next element the current root (top) is connected to
		int val = root.data;
		root = root.next;
		return val;
	}

	public int peek() {
		// Stack underflow, if the root (top) is already null
		if (this.root == null) {
			System.out.println("Stack Underflow");
			return 0;
		}
		
		return this.root.data;
	}

	// Driver code
	public static void main(String[] args) {

		Exercise_2 sll = new Exercise_2();

		sll.push(10);
		sll.push(20);
		sll.push(30);

		System.out.println(sll.pop() + " popped from stack");

		System.out.println("Top element is " + sll.peek());
	}
}