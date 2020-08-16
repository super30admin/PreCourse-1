// Time Complexity : O(1) all operations
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class StackArray {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty() {
		// Write your code here
		return top==-1;
	}

	StackArray() {
		// Initialize your constructor
		top=-1;
	}

	boolean push(int x) {
		// Check for stack Overflow
		// Write your code here
		if(top+1==MAX) {
			System.out.println("Stack Overflow");
			return false;
		}
		top++;
		a[top] = x;
		return true;
	}

	int pop() {
		// If empty return 0 and print " Stack Underflow"
		// Write your code here
		if(top==-1) {
			System.out.println("Stack Underflow");
			return 0;
		}
		int res = a[top];
		top--;
		return res;
	}

	int peek() {
		// Write your code here
		if(top==-1) {
			System.out.println("No elements");
			return 0;
		}
		return a[top];
	}
}

// Driver code 
class Main {
	public static void main(String args[]) {
		StackArray s = new StackArray();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
		s.pop();
		System.out.println(s.peek() + " Peek from stack");
	}

}
