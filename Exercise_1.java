//Time Complexity:
// 1. O(1) for push operation
// 2. O(1) for pop operation

//Space Complexity:
// Space Complexity is O(n)

class Stack {
	// Please read sample.java file before starting.
	// Kindly include Time and Space complexity at top of each file
	static final int MAX = 1000;
	int top;
	int a[]; // Maximum size of Stack

	boolean isEmpty() {
		// Write your code here
		// Checking if array is empty with the help of "top" pointer 
		return top == -1;
	}

	Stack() {
		// Initialize your constructor
		// Initializing array when constructor is called
		this.a = new int[MAX];
		this.top = -1;
	}

	boolean push(int x) {
		// Check for stack Overflow
		// Write your code here
		// Checking if the array is full using "top" pointer. If full, don't push
		// elements, else insert element at the last
		if (top + 1 == MAX) {
			System.out.println("Stack Overflow");
			return false;
		}

		a[++top] = x;
		return true;
	}

	int pop() {
		// If empty return 0 and print " Stack Underflow"
		// Write your code here
		// Checking if array is not empty. If not empty, then remove the last element
		// and decrement "top" pointer
		if (!isEmpty()) {
			int val = a[top];
			a[top--] = 0;
			return val;
		}

		System.out.println("Stack Underflow");
		return 0;
	}

	int peek() {
		// Write your code here
		// Checking if array is not empty. If not, return the last element in array
		if (!isEmpty()) {
			return a[top];
		}

		return 0;
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