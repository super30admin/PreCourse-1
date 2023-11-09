class Stack {
	// Please read sample.java file before starting.
	// Kindly include Time and Space complexity at top of each file
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack
	int size;

	Stack() {
		// Initialize your constructor
	}

	boolean isEmpty() {
		// Write your code here
		return size == 0;
	}

	boolean isFull() {
		return size == a.length;
	}

	boolean push(int x) {
		// Check for stack Overflow
		// Write your code here

		// If full return 0 and print " Stack overflow"
		if (isFull()) {
			System.out.println("stack overflow");
			return false;
		}
		a[top] = x;
		top++;
		size++;
		return true;
	}

	int pop() {
		// If empty return 0 and print " Stack Underflow"
		// Write your code here
		if (isEmpty()) {
			System.out.println("stack underflow");
			return 0;
		}
		int popped = a[--top];
		size--;
		return popped;
	}

	int peek() {
		// Write your code here
		if (isEmpty()) {
			System.out.println("stack underflow");
			return 0;
		}
		int topIndex = top - 1;
		int returnValue = a[topIndex];
		return returnValue;
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
