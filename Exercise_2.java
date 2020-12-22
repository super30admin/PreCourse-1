public class StackAsLinkedList {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data=data;
			this.next=null;
		}
	}


	public boolean isEmpty() {
		// Write your code here for the condition if stack is empty.
		if(root==null) {
			return true;
		}else {
			return false;
		}
	}

	public void push(int data) {
		StackNode newNode=new StackNode(data);
		newNode.next=root;
		root=newNode;
	}

	public int pop() {
		// If Stack Empty Return 0 and print "Stack Underflow"
		StackNode returnNode=root;
		if(root==null) {
			return 0;
		}else {
			root=root.next;
			return returnNode.data;
		}
		// Write code to pop the topmost element of stack.
		// Also return the popped element

	}

	public int peek() {
		// Write code to just return the topmost element without removing it.
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

