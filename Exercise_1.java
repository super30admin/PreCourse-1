package CoursePR;

import java.util.Arrays;
// Implement Stack using Array.
class StackUsingArray { 
	/*
	 * push: O(1) 
	 * pop: O(1) 
	 * peek: O(1) 
	 * is_empty: O(1) 
	 * is_full: O(1) 
	 * Auxiliary Space: O(n), where n is the number of items in the stack.
	 */
    static final int MAX = 10; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    		return (top<0);
    } 

    StackUsingArray() 
    { 
        //Initialize your constructor
    	top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top>=(MAX-1)) {
    		System.out.println("Stack overflow");
    		return false;
    	}
    	else{
    		a[(++top)] = x;
    		System.out.println(x + " pushed into stack"); 
            return true;
    		
    	}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(top <0) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else {
    		int x = a[top--]; 
            return x; 
    		
    	}
    } 
  
    int peek() 
    { 
        //Write your code here
    	if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
    void print(){ 
        for(int i = top;i>-1;i--){ 
        System.out.print(" "+ a[i]); 
        } 
    }
}
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        StackUsingArray sarr = new StackUsingArray(); 
        sarr.push(10); 
        sarr.push(20); 
        sarr.push(30); 
        System.out.println(sarr.pop() + " Popped from stack");
        System.out.println(sarr.peek() + " Top element from stack");
        sarr.print();
        System.out.println();
        System.out.println(Arrays.toString(sarr.a));
    } 
}