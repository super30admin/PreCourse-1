/**
 * Time Complexity
 * Push: 0(1)
 * Pop: O(1)
 * Peek: 0(1)
 * isEmpty: 0(1)
 *
 * Space Complexity: 0(n)
 *
 */

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        return top < 0;
    }

    Stack() {
        // Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top + 1 >= MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
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
