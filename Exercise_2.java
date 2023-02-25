//Time complexity: O(n)
//Space complexity: O(n)
//successfully executed

public class StackAsLinkedList {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			// Constructor here
			this.data = data;
			this.next = null;
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
		StackNode temp = new StackNode(data);

		//check if root is null, then assigned temp to root
		if(root==null) {
			root = temp;
			return;
		}
		StackNode curr= root;

		//iterating through all nodes, after reaching at the last node, adding new node
		while(curr.next!=null) {
			curr= curr.next;
		}
		curr.next=temp;

	
	}
	public int pop() {
	    int x;
		// If Stack Empty Return 0 and print "Stack Underflow"
		// Write code to pop the topmost element of stack.
		// Also return the popped element
		if (root == null) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			// iterating through node
			while (root.next.next != null) {
				root = root.next;
			}
			x= root.next.data;
			 root.next= null;
		}
		return x;
	}

	public int peek() {
		// Write code to just return the topmost element without removing it.
		if(root.next == null){
		    return root.data;
		}
		while(root.next!=null) {
			root= root.next;
		}
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
