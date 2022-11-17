public class StackAsLinkedList {

	StackNode root;
	StackNode top; // to maintain top element


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
		if (root == null)
			return true;
		else
			return false;
	}

	public void push(int data) {
		// Write code to push data to the stack.
		StackNode temp = root;
		if (temp == null) {
			root = new StackNode(data);
			top = root;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new StackNode(data);
			top = temp.next;
		}

	}

	public int pop() {
		// If Stack Empty Return 0 and print "Stack Underflow"
		if(root == null) {
			System.out.println("Stack Underflow");
			return 0;
		}
		// Write code to pop the topmost element of stack.
		// Also return the popped element
		
		StackNode pre = new StackNode(-1);
		StackNode current = root;
		
		if(current.next ==null) {
			root=null;
			top=null;
			return current.data;
		}
		
		while(current.next!=null) {
			pre = current;
			current = current.next;
		}
		pre.next = null;
		top = pre;
		return current.data;
		
	}

	public int peek() {
		// Write code to just return the topmost element without removing it.
		if(root == null) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else return top.data;
	}

	// Driver code
	public static void main(String[] args) {

		StackAsLinkedList sll = new StackAsLinkedList();

		sll.push(10);
		sll.push(20);
		sll.push(30);

		System.out.println(sll.pop() + " popped from stack");
		System.out.println(sll.pop() + " popped from stack");
		System.out.println(sll.pop() + " popped from stack");
		System.out.println(sll.pop() + " popped from stack");
		System.out.println("Top element is " + sll.peek());
		sll.push(40);
		System.out.println("Top element is " + sll.peek());
	}
}
