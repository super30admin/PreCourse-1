// Time Complexity : O(1)
// Space Complexity : O(1)

class Stack {
	// Please read sample.java file before starting.
	// Kindly include Time and Space complexity at top of each file
	static final int MAX = 1000;
	int top;
	int a[];// Maximum size of Stack

	boolean isEmpty() {
		if (a.length == 0)
			return true;
		return false;
		// Write your code here
	}

	Stack() {

		// Initialize your constructor
		a = new int[MAX];
		top = 0;
	}

	boolean push(int x) {

		if (top >= MAX) {
			return false;
		} else {

			a[top] = x;
			top++;
			return true;

		}

		// Check for stack Overflow
		// Write your code here
	}

	int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int lastEle = a[--top];
			a[top] = 0;
			return lastEle;
		}

		// If empty return 0 and print " Stack Underflow"
		// Write your code here
	}

	int peek() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			return a[top];
		}
		// Write your code here
	}
}

// Driver code 
class Main {
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
	}
}
