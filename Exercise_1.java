// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this : None

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top; // Considering top as current index.
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() { // O(1)
        // Write your code here
        // If top is smaller than 0, our stack is empty.
        return top < 0;
    }

    Stack() {
        // Initialize your constructor
        // Initial index value will be -1;
        top = -1;
    }

    boolean push(int x) { // O(1)
        // Check for stack Overflow
        // Write your code here
        if (top >= (MAX - 1)) {
            return false;
        } else {
            // Insert element after incrementing the value of top index.
            a[++top] = x;
            return true;
        }
    }

    int pop() { // O(1)
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (top < 0) {
            System.out.println(" Stack Underflow");
            return 0;
        }
        // Return top most element and then decrease top counter.
        return a[top--];

    }

    int peek() { // O(1)
        // Write your code here
        if (top < 0) {
            // Our stack is empty.
            return -1;
        }
        return a[top];
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