class Stack { 
	//Please read sample.java file before starting.
	//Kindly include Time and Space complexity at top of each file
	static final int MAX = 3; 
	int top = -1; 
	int a[] = new int[MAX]; // Maximum size of Stack 

	boolean isEmpty() 
	{ 
		if(top == -1)	
			//which means stack is empty
			return true;

		else
			return false;
	} 

	Stack() 
	{ 
		 //push(top);
		 //pop();
		 //peek();
		 
	} 

	boolean push(int x) 
	{ 
		System.out.println(top);
		if(top == MAX-1)	{
			System.out.println("Reached TOP, Stack Overflow");
			return false;
		}
		else
		a[++top] = x;
		System.out.println(top +"-->"+ a[top]);

		return false;
	} 

	int pop() 
	{ 
		if(isEmpty())	{
			return 0;
		}
		//If empty return 0 and print " Stack Underflow"
		//Write your code here
		else	{
			
			return a[top--];
			
		}

	} 

	int peek() 
	{ 
		//Write your code here

		return 1;
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