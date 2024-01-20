/** 
 
Time Complexity :
Best Case : O(1)
Worst case : O(1)

Space Complexity :
Best Case : O(n)
Worst case : O(n)

*/

class Stack {
	// Please read sample.java file before starting.
	// Kindly include Time and Space complexity at top of each file
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty() {
		// Write your code here
		if (top == 0)
			return true;
		return false;
	}

	Stack() {
		// Initialize your constructor
		top = -1;
	}

	boolean push(int x) {
		// Check for stack Overflow
		// Write your code here
		if (top + 1 >= MAX)
			throw new StackOverflowError("Maximum size reached");
		a[++top] = x;
		return true;
	}

	int pop() {
		// If empty return 0 and print " Stack Underflow"
		// Write your code here
		if (top <= -1) {
			System.out.println("Stack underflow exception");
			return 0;
		} 
			return a[top--];
	}

	int peek() {
		// Write your code here
		if(top<= -1)
			throw new ArrayIndexOutOfBoundsException("No elements present in the stack");
		return a[top];
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
