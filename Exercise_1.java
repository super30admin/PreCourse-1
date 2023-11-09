/******
 Exercise_1 : Implement Stack using Array.

Time Complexity :                               O(n)
Space Complexity :                              O(1)  
Did this code successfully run on Leetcode :    N/A (Could not find question number)
Any problem you faced while coding this :       No
*******/

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // when top = -1, stack is empty
        if ( top < 0 )
            return true;
        return false;
    }

    Stack() {
        // initilised stack top = -1 i.e. empty stack
        top = -1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        if ( top >= (MAX -1)){
            System.out.println("Stack Overflow!!");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println( x + " is pushed into Stack");
            return true;
        }
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if (top < 0){
            System.out.println("Stack Underflow!!");
            return 0;
        }
        // else pop the topmost element of stack and return the popped element
        else {
            int popValue = a[top--];
            return popValue;
        }
    }

    int peek() {
        // If stack is empty, return 0 and print " Stack Underflow"
        if (top < 0){
            System.out.println("Stack Underflow!!");
            return 0;
        }
        // else return topmost element without removing it
        else{
            int peekValue = a[top];
            return peekValue;
        }
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
