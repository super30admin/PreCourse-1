class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    Stack() {
        top = -1;// empty stack
    }

    boolean push(int x) {
        // Check for stack Overflow
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x; // Incrementing top value and then assigning x value to that index
            return true;
        }
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else
            return a[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return 0;
        } else
            return a[top];// accessing the top indexed value from array and returning it
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

// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach