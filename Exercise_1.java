// Time Complexity:
//Space Complexity:


class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Check top
    	if (top==-1)
    	{
    		return true;
    	}
    	else
    		return false;
    } 

    Stack() 
    { 
        //Intialize top
    	top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if (top>=MAX-1)
    	{
    		System.out.println("Stack Overflow");
    		return false;
    	}
    	else{
    	    top++;
    		a[top] = x;
    	}
    // 	System.out.println(a);
    		return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if (isEmpty())
    	{
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else
    	{
    	    
    		return a[top];
    	}
    } 
  
    int peek() 
    { 
        //Write your code here
    	if (isEmpty()) 
    	{
    		System.out.println("Stack is empty");
    	}
    	return a[top];
    } 
} 
  
// Driver code 
public class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10);
        // System.out.println(s.a);
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
