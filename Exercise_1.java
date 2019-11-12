
class Stack {
	static final int MAX = 1000;
	int top = -1;
	int a[]; // Maximum size of Stack

	boolean isEmpty() {
		boolean isEmpty = false;
		if (top == -1)
			isEmpty = true;

		return isEmpty;
	}

	Stack() {
		a = new int[MAX];
	}

	boolean push(int x) throws Exception {
		/* Check for stack Overflow */
		if (top == MAX)
			throw new Exception("Stack Overflow");

		top++;
		a[top] = x;
		return true;
	}

	int pop() throws Exception {
		/* If empty return 0 and print " Stack Underflow" */
		if (top < 0)
			throw new Exception("Stack Underflow");

		return a[top--];

	}

	int peek() {
		return a[top];

	}
}

// Driver code 
 public class Exercise_1 {
	public static void main(String args[]) {
		Stack s = new Stack();
		try {
			s.push(10);
			s.push(20);
			s.push(30);
			System.out.println(s.pop() + " Popped from stack");
			System.out.println(s.peek());
			System.out.println(s.pop() + " Popped from stack");
			System.out.println(s.peek());
			System.out.println(s.pop() + " Popped from stack");
			System.out.println(s.pop() + " Popped from stack");
			System.out.println(s.isEmpty());
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}