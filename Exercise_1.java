// Time Complexity :O(1)
// Space Complexity :O(1)

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        if (top == -1) {// if top is -1, means we have nothing in our array . So isEmpty returns true
            return true;
        } else {// else it is not empty so return false
            return false;
        }
        // Write your code here
    }

    Stack() {
        top = -1;// setting top as -1 because there is no element in stack initially.
        // Initialize your constructor
    }

    boolean push(int x) {
        if (top >= MAX) {
            System.out.println("Stack overflow");// if last element is at last(more than maximum capacity) index of
                                                 // array stack overflows
            return false;
        } else {
            a[++top] = x;// if last element is not at last index, we can insert at top
            return true;
        }
        // Check for stack Overflow
        // Write your code here
    }

    int pop() {
        if (top == -1) {// if our array is empty stack underflows
            System.out.println("Stack Underflow");
            return 0;
        } else {// if array contains some elements ie.top is greater than -1, we can do pop
                // operation
            return a[top--];
        }
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
    }

    int peek() {
        // same logic as pop operation except we will not decrement top pointer as we
        // are not removing the element.
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top];
        }
        // Write your code here
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
