// Time Complexity : Push, Pop, IsEmpty, Peek all take O(1) time.
// Space Complexity : O(n)
// Any problem you faced while coding this : No

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        if (top < 0)
            return true;
        else
            return false;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        if (top > (a.length - 1)) {
            System.out.println("Stack Overflow!");
            return false;
        } else {
            a[++top] = x;
            return true;
        }

    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Undeflow");
            return 0;
        } else {
            int poppedNumber = a[top];
            top--;
            return poppedNumber;
        }
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return 0;
        } else {
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
        System.out.println(s.peek() + " Peeked");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
    }
}
