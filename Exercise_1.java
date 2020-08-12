class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	if(top == -1)
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
    	if(top == MAX - 1) {
    		System.out.println("Stack Overflow");
    		return false;
    	}
    	
        //Write your code here
    	a[++top] = x;
    	return (true);
    	
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	
        //Write your code here
    	int popElement = a[top];
    	top--;
    	return(popElement);
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(!isEmpty()) {
    		return a[top];
    	}
    	System.out.println("Stack Empty");
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
        System.out.println(s.peek());
    } 
}
