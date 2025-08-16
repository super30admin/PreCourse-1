// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA

// Your code here along with comments explaining your approach
// Initialized top as -1 for empty check. Adding to the top when pushing and removing from top when popping. 
class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        if (top == -1)
            return true;
        return false;
    }

    Stack() {
        // Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        if (MAX == top + 1)
            throw new StackOverflowError();
        // Write your code here
        a[++top] = x;
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if (top == -1) {
            System.out.println("Stack Overflow");
            return 0;
        }

        // Write your code here
        return a[top--];
    }

    int peek() {
        // Write your code here
        if (top == -1)
            return 0;

        return a[top];
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peeked from stack");
        System.out.println(s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.isEmpty());
    }
}
