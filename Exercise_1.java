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
    	top = -1;
        //Initialize your constructor
    	
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top<=MAX)
    	{
    		a[++top] = x;
    		System.out.println("Pushed " + x + " into stack");
    		return true;
    	}
    	System.out.println("Stack Overflow");
    	return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(top>=0 && top<=MAX) {
    		return a[top--];
    	}
    	System.out.println("Stack Underflow");
    	return 0;
    	
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(top>=0 || top <= MAX)
    		return a[top];
    	return -1;
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
        System.out.println(s.peek() + " Top element from stack"); 

        
    } 
}
