// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : Yes.
// I haven't understand the use of the top variable. So, I had taken refrence from geeksforgeeks;

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here

        // if top pointer is less than zero(-1) than it will indicate that stack is
        // empty.
        if (top < 0) {
            return true;
        }
        return false;
    }

    Stack() {
        // Initialize your constructor

        // Initialize top with -1. So, when push data top increase and pop the data top
        // decreases.
        top = -1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here

        // if top pointer is greater than max(1000) it will state that our array is full
        // and no other value will be stored in it.

        if (top > MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        // here First value of top pointer increases than value of x pushed into array.
        a[++top] = x;
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {

            // first it will return top element then decreases the top element.
            return a[top--];

        }
        // Write your code here
    }

    int peek() {

        // check stack is empty or not
        if (isEmpty()) {
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
        System.out.println((s.peek() + " top element in stack"));
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        // here stack is empty
        System.out.println(s.pop() + " Popped from stack");
    }
}
