// Time Complexity : O(1)
// Space Complexity : O(MAX) where MAX is the size of the array
// Did this code successfully run on Leetcode : No, I am getting the following error:
/*
 * Line-26:error:Stack is already defined in this compilation unit [in Main.java]
   import java.util.Stack;
 */
// Any problem you faced while coding this : Looks like LeetCode is picking inbuilt Stack class rather than this class.
// I am able to run this exercise locally without any errors.


// Your code here along with comments explaining your approach

// Since there were no clear instructions given about handling exceptions, I am printing statements and return MAX integer values.

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    /** checks for the size of the stack. If top is -1, then the stack is empty. 
     * TC: O(1)
     */ 
    boolean isEmpty() 
    { 
        //Write your code here 
    	return top == -1;
    } 

    /** Since array is already initialized globally, we are setting top to -1, which
     * is used to put the elements on top of the stack. Top represents the top element of the stack. 
     * TC: O(1)*/
    Stack() 
    { 
        //Initialize your constructor 
    	top = -1;
    } 
  
    /** Pushes the elements to the top of the stack. since top starts from -1,
     * we increment the top and then insert the element. If the max limit is reached,
     * we return false and print stack overflow. (Even an exception can be thrown) 
     * TC: O(1)*/
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top >= MAX) {
    		System.out.println("Stack Overflow");
    		return false;
//    		throw new Exception("Stack Overflow");
    	}
    	a[++top] = x;
    	return true;
    } 
  
    /** Checks if the stack is empty and then removes top element and then decrements
     * top. If stack is empty, returns 0 with Stack underflow statement. 
     * TC: O(1)*/
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	int x = a[top--];
    	return x;
    } 
  
    /** Returns top element of the stack. if the stack is either empty or full, it returns MAX_VALUE
     * or instead we can throw an error. 
     * TC: O(1)*/
    int peek() 
    { 
        //Write your code here
    	if(top == -1 || top >= MAX)
    		return Integer.MAX_VALUE;
    	return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.pop();
        System.out.println(s.isEmpty());
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
    } 
}
