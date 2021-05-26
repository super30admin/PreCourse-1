// Time Complexity : O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

/**
 * 1. Create a node class to hold data and next node.
 * 2. Hold pointer to last element as rot to do stack LIFO
 * 
 */
 
class StackAsLinkedList {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void push(int data) {
		StackNode newNode = new StackNode(data);
		if (!isEmpty()) {
			StackNode oldRoot = root;
			root = newNode;
			newNode.next = oldRoot;
		} else {
			root = newNode;
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int val = root.data;
			root = root.next;
			return val;
		} else {
			System.out.println("Stack Underflow");
			return 0;
		}
	}

	public int peek() {
		if (!isEmpty()) {
			return root.data;
		} else {
			System.out.println("Stack Underflow");
			return 0;
		}
	}

}

class Exercise_2 {
	// Driver code
	public static void main(String[] args) {

		StackAsLinkedList s = new StackAsLinkedList();

		for (int i = 1; i <= 1000; i++) {
			s.push(i);
		}

		System.out.println("peek from stack " + s.peek());

		for (int i = 1000; i > 0; i--) {
			s.pop();
		}
		System.out.println("underflow status " + s.pop());
	}
}
