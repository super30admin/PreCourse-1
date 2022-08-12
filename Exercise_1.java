// Time Complexity : Push = O(1); Pop = O(1); Peek = O(1)
// Space Complexity : O(n) 

// Did this code successfully run on Leetcode : Link not available

// Any problem you faced while coding this : Brushing up Stack concept & Java syntax + familiarizing with usage of git.

class Stack { 

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if (top < 0) // top = 0 will 1st element. top < 0 means no element in stack.
            return true;
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1; // begining with empty stack. top points to top of stack. 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
         //incrementing top to see if the inserting postion is not overflowing
        if (++top < MAX) { 
            a[top] = x; 
            return true;
        }
        System.out.println("Stack Overflow");
        return false;
    } 
  
    int pop() 
    { 
        // if stack not empty then pop the top element then decrement top
        if(!isEmpty()) {
            return a[top--];
        }
        //If empty return 0 and print " Stack Underflow"
        System.out.println("Stack Underflow");
        return 0;
    } 
  
    int peek() 
    { 
        //returning the top element without adjusting top pointer.
        if (isEmpty()){
            System.out.println("Stack Empty");
            return 0;
        } else {
            return a[top];
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
        
        // for testing the stack operations
        for (int i = 0; i < 4; ++i) {
            if (!s.isEmpty()) {
                System.out.println(s.peek());
            }
            System.out.println(s.pop());
        }
    } 
}
