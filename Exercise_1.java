// T.C. push -> O(1), S.C ->O(1)
// T.C. pop -> O(1), S.C ->O(1)
// T.C. peek -> O(1), S.C ->O(1)

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        if (top == 0)
            return true;
        else
            return false;
    }

    Stack() {
        // Initialize your constructor
        top = 0;
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        top++;
        if (top == MAX) {
            System.out.println("Stack overflow");
            return false;
        } else {
            a[top] = x;
            return true;
        }
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (top == 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            // System.out.println("Top " + top);
            return a[top--];
        }
    }

    int peek() {
        // Write your code here
        if (top == 0)
            return 0;
        else
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
