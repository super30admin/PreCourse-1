

public class Exercise_2 {

	StackNode root = null;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int x) {

			data = x;
		}
	}

	public boolean isEmpty() {
		/* Write your code here for the condition if stack is empty. */
		if (root == null)
			return true;
		else
			return false;

	}

	public void push(int data) {

		/* Write code to push data to the stack. */
		StackNode node = new StackNode(data);
		node.next = root;
		root = node;
	}

	public int pop() throws Exception {
	/*   If Stack Empty Return 0 and print "Stack Underflow"
		 Write code to pop the topmost element of stack.
		 Also return the popped element */
		int data = 0;
		if (root == null)
			throw new Exception("Stack Underflow");
		else {
			data = root.data;
			root = root.next;
		}
		return data;

	}

	public int peek() throws Exception {
		/* Write code to just return the topmost element without removing it. */
		if (root == null)
			throw new Exception("Stack Underflow");
		return root.data;
	}

	// Driver code
	public static void main(String[] args) {

		Exercise_2 sll = new Exercise_2();

		try {
			sll.push(10);
			sll.push(20);
			sll.push(30);
			sll.push(40);
			System.out.println(sll.pop() + " popped from stack");
			System.out.println("Top element is " + sll.peek());
			System.out.println(sll.pop() + " popped from stack");
			System.out.println("Top element is " + sll.peek());
			System.out.println("Is Stack Empty?  " + sll.isEmpty());
			System.out.println(sll.pop() + " popped from stack");
			System.out.println("Top element is " + sll.peek());
			System.out.println(sll.pop() + " popped from stack");
			System.out.println(sll.pop() + " popped from stack");
			System.out.println("Is Stack Empty?  " + sll.isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
