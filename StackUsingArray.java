// Time Complexity :
// push, pop, peek - O(1)
// isEmpty - O(1)
//
// Space Complexity :
// O(n) where n = MAX size of the stack
//
// Did this code successfully run on Leetcode :
// couldn't find it on leetcode
//
// Any problem you faced while coding this :
// No

// Your code here along with comments explaining your approach:
// Implemented a basic stack using a fixed-size array. The `top` variable tracks the index of the topmost element.
// `push()` adds an element at the next available index and updates `top`.
// `pop()` returns and removes the top element, adjusting the `top`.
// `peek()` returns the top element without removing it.
// Added checks to avoid overflow and underflow conditions.

class StackUsingArray { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 0);
    } 

    StackUsingArray() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top >= (MAX -1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            ++top;
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
       if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }  
    } 
  
    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack is empty");
            return 0;
        } else { 
            return a[top];
        } 
    } 
    //Driver code
    public static void main(String args[]) 
    { 
        StackUsingArray s = new StackUsingArray(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
} 
  


