// Time Complexity : O(1) for push/pop/peek
// Space Complexity : O(1) for push/pop/peek
// Any problem you faced while coding this : Played around with top value in the three fns to get the desired output.


/**
 * Implement Stack using Array.
 * 
 * Initialized the top variable as -1. This serves as the head for the stack.
 * Push: Increment the top and add the value at the top index.
 * Pop: Fetch the element at the current top and decrement the top by 1.
 * Peek: Only fetch the element at the current top.
 */
class Stack { 
	static final int MAX = 1000;
	int top; 
	int a[] = new int[MAX]; // Maximum size of Stack 

	boolean isEmpty() 
	{ 
		return top == -1;
	} 

	Stack() 
	{ 
		top = -1;
	} 

	boolean push(int x) 
	{ 
		if (top == MAX-1) {
			System.out.println("Stack Overflow");
			return false;
		}
		
		a[++top] = x;
		return true;
	} 

	int pop() 
	{ 
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		}

		return a[top--];
	} 

	int peek() 
	{ 
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}

		return a[top];
	} 
} 

// Driver code 
class Main { 
	public static void main(String args[]) 
	{ 
		Stack s = new Stack(); 
		s.push(10); 
		s.push(20); 
		s.push(30); 

		// Stack Overflow error
		s.push(40); 

		// 30 is popped expected
		System.out.println(s.pop() + " Popped from stack");

		// 20 is returned for peek
		System.out.println(s.peek() + " Peeked from stack");

		// 20 is popped expected
		System.out.println(s.pop() + " Popped from stack");
		// 10 is popped expected
		System.out.println(s.pop() + " Popped from stack");

		// Stack is empty
		System.out.println("Is stack empty? " + s.isEmpty());

		// Stack underflow error
		s.pop();
		// Stack underflow error
		System.out.println(s.peek() + " Peeked from stack");
	} 
}
