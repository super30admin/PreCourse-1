// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Stack { 
	// Time Complexity : O(1)
	// Space Complexity :  O(1)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return top<0;
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
    	if(top>=(MAX-1)) { //Check for Stack overflow
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top]=x; // incrementing top variable and then adding an element on the top position each time when push method is called
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(top<1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
        	return a[top--];// Get the element on the top position and then decrementing top variable each time when pop method is called
        }
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(top<1) { //If stack is empty
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
        	return a[top]; // Top element from the stack
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
        System.out.println(s.peek() + " First Time Peek from stack"); 
        System.out.println(s.pop() + " Second time Pop from stack"); 
        
    } 
}
