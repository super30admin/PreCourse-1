// Time Complexity : O(1)
// Space Complexity : O(1) since we are using array of constant length
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        return (top < 0); // returns true is array is empty
    }

    Stack() {
        // Initialize your constructor
        top = -1;
    }

    boolean push(int x) {

        // Write your code here
        if (top + 1 < MAX) {
            top++;
            a[top] = x;
            return true;
        } else {
            System.out.println("Stack overflow error"); // Check for stack Overflow
            return false;
        }
    }

    int pop() {

        // Write your code here
        if (top >= 0) {
            int popped_value = a[top]; // pop the topmost element
            top--;
            return popped_value; // return the popped value
        } else {
            System.out.println("Stack underflow error"); // If empty return 0 and print " Stack Underflow"
            return -1;
        }
    }

    int peek() {
        // Write your code here
        if (top >= 0) {
            return a[top]; // return the topmost element
        } else { // If empty return -1 and print " Stack empty"
            System.out.println("Stack empty");
            return -1;
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
