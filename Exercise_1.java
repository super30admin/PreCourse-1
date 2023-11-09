class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return top == -1;
    }

    Stack() {
        // Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top + 1 == a.length) {
            System.out.println("stack Overflow");
            return false;

        } else {
            top = top + 1;
            a[top] = x;
            return true;
        }
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int val = a[top];
            top = top - 1;
            return val;
        }
    }

    int peek() {
        // Write your code here
        if (top == -1) {
            System.out.println("Stack Underflow");
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
