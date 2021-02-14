package com.sthirty.precourseone.prblmone;

class Stack {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty() {
		return false;
		// Write your code here
	}

	Stack() {
		top = 0;
	}

	boolean push(int x) {
		if (top < 1000) {
			a[top] = x;
			top++;
			return true;
		} else {
			return false;
		}

		
	}

	int pop() {
		
		if(top>0)
		{
			top=top-1;
			return a[top];
		}
		else
		{
		
			return 0;
		}
		
		// If empty return 0 and print " Stack Underflow"
		// Write your code here
	}

	int peek() {
		return a[top];
		// Write your code here
	}
}

// Driver code 
class Exercise_1 {
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.pop();
		s.pop();
		s.pop();
		
		System.out.println(s.peek());
		
		System.out.println(s.pop() + " Popped from stack");
	}
}