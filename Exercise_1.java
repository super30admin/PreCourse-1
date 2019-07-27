package Stack;

public class Stack { 
	static final int MAX = 1000; 
    int top; //Index of the top element
 // Declaring an array of size MAX. An int array declaration in Java initializes all the elements of the array to 0.
    int a[] = new int[MAX]; 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    		if (top == -1) {
    			return true;
    		}
    		return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    		// Since all the elements of an array are initialized to 0, top is set to -1 at the beginning.
    		top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    		if(top >= MAX-1) {
    			System.out.println("Stack Overflow");
    			return false;
    		} 
    		top++;
    		a[top] = x;
    		System.out.println(x+ " pushed to stack");
		return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    		if(top < 0) {
    			System.out.println("Stack Underflow");
    			return 0;
    		}
    		int x = a[top];
    		a[top] = 0;
    		top--;
    		return x;
    } 
  
    int peek() 
    { 
        if(top < 0) {
        		System.out.println("Stack Underflow"); 
            return 0;
        } 
        return a[top];
        
    } 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
} 