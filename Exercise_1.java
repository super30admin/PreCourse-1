//Push, Pop, Peek
// Time Complexity : O(1)
// Space Complexity : O(1)

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
        top = -1; // Assuming stack to be empty initially
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top > a.length - 1) { // Checking if stack is full
            System.out.println("Stack Overflow");
            return false;
        } else {
            top++;
            a[top] = x;
            return true;
        }
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        int x = 0;
        if (top == -1) { // Checking if stack is empty
            System.out.println("Stack Underflow");
        } else {
            x = a[top];
            top--;
        }
        return x;
    }

    int peek() {

        return a[top]; // returns top of the stack element
    }

    void display() { // Pushed a display functions to view stack elements
        for (int i : a) {
            System.out.println(i);
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
        s.display();
    }
}
