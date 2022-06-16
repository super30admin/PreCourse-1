class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file

    // Time Complexity : O(1)
    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : N/A

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        return (top < 0); // Returning Boolean value if the top(index of an array) is less than the
                          // minimum size
    }

    Stack() {
        // Initialize your constructor
        top = -1; // Declaring the index of array(top)
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top >= (MAX - 1)) { // Checking if the index of the array is greater than the maximum size of the
                                // stack
            System.out.println("STACK OVERFLOW!!");
            return false;
        } else { // Else Insert the value array(stack)
            a[++top] = x;
            System.out.println(x + " Pushed into the Stack");
            return true;
        }

    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (top < 0) { // Checking if the stack is empty, i.e, if the index is less than the zero
            System.out.println("STACK UNDERFLOW!!");
            return 0;
        } else { // Printing the last index element of the array and decrementing the size of the
                 // array
            return a[top--];
        }
    }

    int peek() {
        // Write your code here
        if (top < 0) { //// Checking if the stack is empty i.e, if the index is less than the zero
            System.out.println("STACK UNDERFLOW!!");
            return 0;
        } else { // Returning the last index element of the array
            return a[top];
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
