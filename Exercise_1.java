class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
    	if(top<0)
    		return true;
    	return false;
    	
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top==MAX-1)
    	{
    		System.out.println("Stack Overflow");
    		return false;
    	}
    	else
    	{
    		a[++top] = x;
    		System.out.println(x + " was pushed on the stack");
    		return true;
    	}
    } 
  
    int pop() 
    { 
    	int top_element;
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(top<0)
    	{
    		System.out.println("Stack underflow");
    		return 0;
    	}
    	else
    	{
    		top_element = a[top];
    		top--;
    		return top_element;
    	}
    } 
  
    int peek() 
    { 
        //Write your code here
    	int top_element;
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(top<0)
    	{
    		System.out.println("Stack underflow");
    		return 0;
    	}
    	else
    	{
    		top_element = a[top];
    		return top_element;
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
