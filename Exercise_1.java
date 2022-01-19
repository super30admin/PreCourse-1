// Time Complexity : O(1) for all the functions 
// Space Complexity : O(n), array of the length of inputs and top is constant space

class Stack {
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
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        }

        a[++top] = x;
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }

        return a[top--];
    }

    int peek() {
        // Write your code here
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return a[top];
    }

    // Driver code
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
