class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	if(top<0)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    } 
    Stack() 
    { 
    	top = -1;
        //Initialize your constructor 
    } 

    boolean push(int x) 
    { 
        //Check for stack Overflow
		//Write your code here
    	if(top<MAX-1)
    	{
    		a[++top]=x;
    		return true;
    	}
    	else
    	{
    		System.out.print("Check for stack Overflow");
    		return false;
    	}       
    	
    } 

    int pop() 
    { 
    	if(top<0)
    	{
    		System.out.print("Stack Underflow");
    		return 0;
    	}
    	else
    	{
    		int result = a[top];
    		top--;
    		return result;
    	}
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	
    } 

    int peek() 
    { 
        //Write your code here
    	if(top<0)
    	{
    		System.out.print("Stack Underflow");
    		return 0;
    	}
    	else
    	{
    		return a[top];
    	}
    	
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
