import java.util.Arrays;
import java.util.EmptyStackException;

class Stack {
	// Time Complexity : O(1)
	// Space Complexity : O(n)

	/*
	 * Approach: initialize a constructor with initial values, create a method to
	 * isEmpty to known if the stack is empty, create a synchronized methods for
	 * push, pop and peek for thread safe
	 */

	static final int MAX = 1000;
	int top;
	int[] a;

	Stack() {
		this.a = new int[MAX]; // Maximum size of Stack
		this.top = -1; // initial value of top
	}

	boolean isEmpty() {
		return top == -1;
	}

	synchronized boolean push(int x) {
		// Check for stack Overflow
		if (a.length <= MAX) {
			top++;
			a[top] = x;
			return true;
		}
		System.out.println("Stack Overflow");
		return false;
	}

	synchronized int pop() {
		// if empty return 0 and print " Stack Underflow"
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		}
		int poppedInt = a[top];
		top--;
		return poppedInt;
	}

	synchronized int peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return a[top];
	}

	public String toString() {
		return Arrays.toString(Arrays.copyOf(a, top + 1));
	}
}

// Driver code 
class Main {
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(10);
		System.out.println("stack" + s);
		s.push(20);
		System.out.println("stack" + s);
		s.push(30);
		System.out.println("stack" + s);
		System.out.println(s.pop() + " Popped from stack");
		System.out.println("stack" + s);
	}
}
