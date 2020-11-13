public class Exercise_1 {
	// Driver Code
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
	}

}

//Implement Stack using Array.
class Stack {
	static final int MAX = 1000;
	// Top is initially -1
	int top = -1;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty() {
		// Write your code here
		return top == -1;
	}

	// Constructor
	Stack() {
		this.a = new int[MAX];
	}

	boolean push(int x) {
		// Check for stack Overflow
		if (isFull()) // first check if stack is full or not
			return false;

		a[++top] = x;
		return true;

	}

	int pop() {
		// If empty return 0 and print " Stack Underflow"
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		}

		return a[top--];

	}

	int peek() {
		// Write your code here
		if (isEmpty()) {
			return -1;
		}
		return a[top];
	}

	// Method to check if top is equal to full
	boolean isFull() {
		return top == a.length - 1;
	}
}


// Time Complexity 
// Push: O(1)
// Pop: O(1)
// Peek: O(1)
