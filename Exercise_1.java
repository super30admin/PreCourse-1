// Time Complexity : O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

/**
 * 1. Initializa an array with max size
 * 2. Maintain a pointer for top to do LIFO for stack
 * 
 */
class Stack {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	// if top index is less than zero return true
	boolean isEmpty() {
		return top < 0;
	}

	Stack() {
		top = -1;
	}

	// if capacity is not full insert and return true otherwise return false
	boolean push(int x) {
		if (top < (MAX - 1)) {
			a[++top] = x;
			return true;
		} else {
			System.out.println("Stack is full. Can not insert new item.");
			return false;
		}
	}

	//if not empty pop and return element else return 0
	int pop() {
		if (!isEmpty()) {
			return a[top--];
		} else {
			System.out.println("Stack Underflow");
			return 0;
		}
	}

	//if not empty peek and return element else return 0
	int peek() {
		if (!isEmpty()) {
			return a[top];
		} else {
			System.out.println("Stack Underflow");
			return 0;
		}
	}
}

// Driver code 
class Exercise_1 {
	public static void main(String args[]) {
		Stack s = new Stack();

		for (int i = 1; i <= 1000; i++) {
			s.push(i);
		}

		System.out.println("overflow status " + s.push(1001));

		System.out.println("peek from stack " + s.peek());

		for (int i = 1000; i > 0; i--) {
			s.pop();
		}
		System.out.println("underflow status " + s.pop());

	}
}
