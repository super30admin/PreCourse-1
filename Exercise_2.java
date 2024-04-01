public class Exercise_2 {

	static StackNode root;

	static class StackNode {
		int data;
		StackNode next;
		StackNode node;
		
		StackNode() {
			
		}
		
		StackNode(int data) {
			node = new StackNode();
			node.data = data;
		}
	}
	
	public Exercise_2() {
		
	}

	public boolean isEmpty() {
		if (root == null)
			return true;

		return false;
	}

	public void push(int data) {
		if (root == null) {
			root = new StackNode(data);
		} else {
			
			StackNode tmp = root;
			
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			
			tmp.data = data;
			tmp.next = null;
		}
	}

	public int pop() {
		if (root == null) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			StackNode tmp = root;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			int val = tmp.data;
			tmp = null;
			return val;
		}
		// If Stack Empty Return 0 and print "Stack Underflow"
		// Write code to pop the topmost element of stack.
		// Also return the popped element
	}

	public int peek() {
		if (root == null) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			StackNode tmp = root;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			return tmp.data;
		}
		// Write code to just return the topmost element without removing it.
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
