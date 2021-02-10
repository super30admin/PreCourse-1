public class Stack {
	static final int MAX = 1000; 
    int top; 
    int[] a = new int[MAX]; // Maximum size of Stack 

    Stack() 
    {
        top = -1;
        //Initialize your constructor 
    } 

    boolean isEmpty() 
    { 
        if(top == -1) return true;
        return false;
        //Write your code here 
    } 

    boolean push(int x) 
    {
    	if(top-1 < MAX){
    		a[++top] = x;
    		return true;
    	}
    	else {
    		System.out.println("Stack Overflow");
    		return false;
    	}
//        System.out.println(top+" "+a[top-1]);
        //Check for stack Overflow
        //Write your code here
    }
  
    int pop() 
    { 
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
        return a[top--];
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
        return a[top];
        //Write your code here
    } 

    // Driver code
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());
        s.pop();
        s.pop();
        System.out.println(s.pop());
    }
}
