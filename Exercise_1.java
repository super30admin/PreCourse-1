import java.util.Stack;

class Exercise_1 {
	// Please read sample.java file before starting.
	// Kindly include Time and Space complexity at top of each file
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty() {
		
		if (top == -1)
			return true;
		// Write your code here
		return false;
	}

	public Exercise_1() {
		top = -1;
	}

	boolean push(int x) {
		if (top == -1) {
			top = 0;
		}

		if (top <= a.length) {
			return false;
		}

		a[top] = x;

		return true;

		// Check for stack Overflow
		// Write your code here
	}

	int pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return 0;
		}
		
		if (top == a.length) {
			System.out.println("Stack overflow");
			return -1;
		}

		return a[top++];

		// If empty return 0 and print " Stack Underflow"
		// Write your code here
	}

	int peek() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return 0;
		}

		if (top == a.length) {
			System.out.println("Stack overflow");
			return -1;
		}

		return a[top];
	}
	
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
	}
}
