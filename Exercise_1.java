// Time Complexity : each operation O(1)
// Space Complexity : O(n) considering Max = n
// Did this code successfully run on Leetcode : Ran tests in the local
// Any problem you faced while coding this :

class Stack { 
	static final int MAX = 1000; 
	int top; 
	int a[] = new int[MAX]; // Maximum size of Stack 

	boolean isEmpty() 
	{ 
		if(top == -1)
			return true;
		else
			return false;
	} 

	Stack() 
	{ 
		top = -1;
	} 

	boolean push(int x) 
	{ 
		 //Check for stack Overflow
		
		if(top == MAX - 1)
			return false;
		else {
			a[++top] = x;
			return true;
		}
	} 

	int pop() 
	{ 
		//If empty return 0 and print " Stack Underflow"
		if(top == -1) {
			System.out.println("stack underflow");
			return 0;
		} else 
			return a[top--];
		
	} 

	int peek() 
	{ 
		if(top == -1) {
			System.out.println("stack underflow");
			return 0;
		} else 
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
		System.out.println(s.pop() + " Popped from stack"); 
	} 
}
