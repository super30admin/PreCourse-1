public class StackAsLinkedList {

	// Time Complexity : O(1)
	// Space Complexity : O(n)
	// Did this code successfully run on Leetcode : Yes
	// Any problem you faced while coding this : No

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
		if (isEmpty()) {
			root = new StackNode(data);
			return;
		}
		StackNode node = new StackNode(data);
		node.next = root;
		root = node;
	}

	public int pop() {
		if (root == null) {
			System.out.println("Stack Underflow");
			return 0;
		}
		StackNode node = root;
		root = root.next;
		return node.data;
	}

	public int peek() {
		if (root != null) {
			return root.data;
		}
		return 0;
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
