
// Time Complexity : O(1) for each operation
// Space Complexity : O(N) - Size of stack

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        return top == 0;
    }

    Stack() {
        // Initialize your constructor
        this.top = 0;
    }

    boolean push(int x) {
        // Check for stack Overflow
        if (top >= MAX) {
            return false;
        }
        // Write your code here
        a[top++] = x;
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if (top == 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // Write your code here
        return a[--top];
    }

    int peek() {
        // Write your code here
        if (top == 0) {
            return 0;
        }
        return a[top - 1];
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        // System.out.println(Arrays.toString(s.a));
        System.out.println(s.pop() + " Popped from stack");
    }
}
