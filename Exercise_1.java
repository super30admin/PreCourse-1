class Stack {
	// Time Complexity : O(1)
    // Space Complexity : O(n) (n= MAX)
    // Did this code successfully run on Leetcode : Yes (after updating the Class name)
    // Any problem you faced while coding this : No

	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty() {
		return top < 0;
	}

	Stack() {
		top = -1;
		a = new int[MAX];
	}

	boolean push(int x) {
		if (top < MAX - 1) {
            a[++top] = x;
            return true;
        }
        System.out.println("Stack Overflow");
        return false;
	}

	int pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return 0;
		}
		return a[top--];
	}

	int peek() {
		if (isEmpty()) {
			return 0;
		}
		return a[top];
	}
}

class Main {
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
	}
}
