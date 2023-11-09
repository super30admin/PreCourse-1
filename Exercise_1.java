// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        return (top == -1);
    }

    Stack() {
        // Initialize your constructor
        this.top = -1;
    }

    void push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top == (MAX - 1)) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            a[top] = x;

        }
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int previous_top = top;
            top--;
            return a[previous_top];
        }
    }

    int peek() {
        // Write your code here
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
