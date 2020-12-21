package Package1;

class Stack {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty() {
		// Write your code here
		if (top == 0) {
			return true;
		}
		return false;

	}

	Stack() {
		// Initialize your constructor
		top = 0;
	}

	boolean push(int x) {
		// Check for stack Overflow
		// Write your code here
		if (top <= MAX) {
			a[top] = x;
			top++;
			return true;
		} else {
			System.out.println("The stack is full.");
			return false;
		}
	}

	int pop() {
		if (top > 0) {
			int ret = a[top - 1];
			top = top - 1;
			return ret;
		}
		return -1;

	}

	int peek() {
		return (a[top - 1]);
	}
}

// Driver code 
public class Main {
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
		System.out.println(s.pop() + " Popped from stack");
		System.out.println(s.pop() + " Popped from stack");
		System.out.println(s.isEmpty());
		s.push(50);
		System.out.println(s.isEmpty());
	}
}
