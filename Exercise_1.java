/*
Time Complexity : O(1) Push and pop takes only one cycle.
Space Complexity : O(1) No additional space used.
Did this code successfully run on Leetcode : Ran on the editor.
Any problem you faced while coding this : No
*/

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        /*
         * if top is -1 that means no element is present, return true otherwise false.
         */
        if(top == -1) {
            return true;
        }
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
        /*
         * Check if the stack is full, if full report a message or else put the element in the stack.
         */
        if (top == MAX-1) {
            System.out.println("Stack is full");
            return false;
        } else {
            a[++top] = x;
        }
        return true;
    } 
  
    int pop() 
    {
        /*
         * If isEmpty return true stack is empty otherwise return the element
         */
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        }
        return a[top--];

    } 
  
    int peek() 
    {
        if (isEmpty()) {
            return -1;
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
  
// Driver code 

