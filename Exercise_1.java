// Time Complexity :
/*  push: O(1)
    pop: O(1)
    peek: O(1)
    empty: O(1) */

// Space Complexity : O(n) where n = Max

// Did this code successfully run on Leetcode : Yes

// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/*  Stack constructor : Assigning top varibale as -1 which means intially there is no element in the stack.
    isEmpty function : check if there is any value in stack by checking the value of top. If top is -1 that means stack is empty.
    push function :  stack will overflow only when the top value will be greater than equal to len of the array. i.e. >= 999
    pop function : stack will be Underflow if the top variable is -1, i.e. there is no value in stack. we have to return integer value so assigning the top element from the stack to be removed since stack is LIFO.
    peek function :  print the last element in the stack. */
class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    // check if there is any value in stack by checking the value of top. If top is
    // -1 that means stack is empty.
    boolean isEmpty() {
        // Write your code here
        return top < 0;
    }

    // Assigning top varibale as -1 which means intially there is no element in the
    // stack.
    Stack() {
        // Initialize your constructor
        top = -1;
    }

    // stack will overflow only when the top value will be greater than equal to len
    // of the array. i.e. >= 999
    boolean push(int x) {
        // Check for stack Overflow
        if (top >= MAX - 1) {
            return false;
        }

        // Write your code here
        a[++top] = x;
        return true;
    }

    // stack will be Underflow if the top variable is -1, i.e. there is no value in
    // stack.
    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if (top < 0) {
            System.out.print("Stack Underflow");
            return 0;
        }

        // we have to return integer value so assigning the top element from the stack
        // to be removed since stack is LIFO.
        // Write your code here
        int element = a[top--];

        return element;
    }

    // print the last element in the stack.
    int peek() {
        // Write your code here
        return a[top];
    }
}

// Driver code
class Exercise_1 {
    public static void main(String args[]) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        // peek element form stack
        System.out.println(s.peek() + " Peek from stack");
        // pop element from stack
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        // check if the stack is empty
        System.out.println(s.isEmpty() + " is Empty stack!!");
    }
}
