
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    // Time Complexity
    // push- O(1)
    // pop - O(1)
    // Peek - O(1)
    // Space Complexity - O(n)


    static final int MAX = 10; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
    	return a.length == 0?true:false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if (top == MAX-1) {
    		System.out.println("Stack overflow");
    		return false;
    	}
       	top++;
    	a[top] = x;
    	return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(top <0) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	
    	int popped = a[top];
    	a[top] = 0;
    	top--;
    	return popped;
    } 
  
    int peek() 
    { 
        //Write your code here
    	
    	if (top == -1) {
    		System.out.println("Stack is empty");
    		return -9999;
    	}
    	return a[top];
    } 
} 

public class Precourse {
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.peek() + " Peek from stack"); 

        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek() + " Popped from stack"); 
        
    } 
}
