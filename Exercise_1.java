// Time Complexity : O(1)
// Space Complexity : O(1) Actually O(MAX) but since MAX is a constant here
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this : NO
class Stack {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // top is initialized as -1 at creation
        return top == -1;
    }

    Stack() {
        // Initializing the constructor
        top = -1;
    }

    boolean push(int x) {
        // Check if top has reached MAX
        if(top == MAX) {
            System.out.println("Stack Overflow!");
            return false;
        }
        // Increment top to point to latest element
        top++;
        a[top] = x;
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if(top == -1) {
            System.out.println("Stack Underflow!");
            return 0;
        }
        int res = a[top];
        // "Delete" the element from stack
        a[top] = 0;
        // Decrement top to point to the latest element
        top--;
        return res;
    }

    int peek() {
        // If empty return 0 and print " Stack Underflow"
        if(top == -1) {
            System.out.println("Stack Underflow!");
            return 0;
        }
        return a[top];
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peeked");
    }
}
