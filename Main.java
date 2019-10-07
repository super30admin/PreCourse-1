
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
    	else {
    		return false;
    	}
    } 

    Stack() 
    { 
        //Initialize your constructor
    	top=-1;
    	
    	 
    	
    	
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top>=1000)
    	{
    		System.out.println("The Stack is Full, OverFlow ");
    		return false;
    	}
    	else {
    		top++;
	    	a[top]=x;
	    	return true;
	    	
    	}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(top<0)
    	{
    		System.out.println("Stack Underflow ");
    		return 0;
    	}
    	else {
    		//top=top-1;
    		
    		int temp= a[top];
    		top=top-1;
    		return temp;
    		
    	}
    } 
  
    int peek() 
    { 
        //Write your code here
    	
    	return a[top];
    } 
} 
  
// Driver code 
public class Main {
	 Main()
	{
		System.out.println("Driver class constructor");
	}
	
    public static void main(String args[]) 
    { 
    	
    	Main m= new Main();
    	
    	System.out.println("starting stack");
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
