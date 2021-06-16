public class Stack {
	static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top<0)
        	return true;
        else
        	return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top =-1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if(top - 1>= MAX)
    	{
    		System.out.println("stack overflow");
    		return false;
    	}
    	else 
    	{
        a[++top]=x;
        return true;
    	}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if(isEmpty())
    	{
    		System.out.println("Stack is empty");
    		return 0;
    	}
    	else
    	{
        int y = a[top--];
        return y;
    	}
    } 
  
    int peek() 
    { 
        int y = a[top];
        return y;
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
