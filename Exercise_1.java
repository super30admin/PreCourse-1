
public class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 


        System.out.println(s.peek() + " Peeked from stack"); 

        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        

        System.out.println(s.peek() + " Peeked from stack"); 
   
    } 

    public boolean isEmpty() 
    { 
        //Write your code here
    	if (top < 0) return true;
    	
    	return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
    	top = -1;
    } 
  
    public boolean push(int x) 
    { 
        //Check for stack Overflow
    	if (top >= MAX) {
    		// stack full
    		System.out.println("Stack full ");
    		return false;
    	}
        //Write your code here
    	a[++top] = x;
    	
    	return true;
    } 
  
    public int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if (top < 0) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	return a[top--];
    } 
  
    public int peek() 
    { 
        //Write your code here
    	if (top < 0 || top >= MAX) {
    		System.out.println("Nothing in stack to peek");
    		return 0;
    	}
    	return a[top];
    	
    } 
} 
  
