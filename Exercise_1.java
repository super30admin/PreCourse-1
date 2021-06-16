// Time Complexity : O(1) for all operations
// Space Complexity : O(n) -> n is the maximum stack size
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

public class Exercise_1 {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty() {
		// Return stack is empty if top is -1
		return top == -1;
	}

	Exercise_1() {
		// Initialize top to -1. When top = -1, stack is empty
		top = 0;
	}

	boolean push(int x) {
		// If the stack is full, then it is Stack Overflow
		if (top == MAX - 1) {
			System.out.println("Stack Overflow");
			return false;
		}
		// Increment top and add the element to the stack
		a[++top] = x;
		return true;
	}

	int pop() {
		// If stack is already empty, it is Stack Underflow
		if (top == -1) {
			System.out.println("Stack Underflow");
			return 0;
		}
		// Decrement top. Return the previous top.
		return a[top--];
	}

	int peek() {
		// If stack is already empty, it is Stack Underflow
		if (top == -1) {
			System.out.println("Stack Underflow");
			return 0;
		}
		// Return the top element.
		return a[top];
	}
}

//Driver code 
class Main {
	public static void main(String args[]) {
		Exercise_1 s = new Exercise_1();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
	}
}