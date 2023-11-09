// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nothing as such

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() { // O(1)
        // Write your code here
        // Returning true, if our top is negative, which means Stack is empty
        return (top < 0);
    }

    Stack() {
        // Initialize your constructor
        top = -1;
    }

    boolean push(int x) { // O(1)
        // Check for stack Overflow
        // Write your code here
        if (top >= (MAX - 1)) { // If top is larger than Length-1, Implies out stack has overflow
            System.out.println("Out of range!!");
            return false;
        } else {
            top++; // Increasing the value of top, to insert element at top
            a[top] = x; // Adding new element at top
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() { // O(1)
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top]; // Returning top element
            top--; // Decreasing the value of top, after popping the element from top
            return x;
        }
    }

    int peek() { // O(1)
        // Write your code here
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top]; // Returning the top most element
            return x;
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
        System.out.println("Top element = :" + s.peek());
        System.out.print("Elements present in stack are:");
        System.out.print(s);
    }
}
