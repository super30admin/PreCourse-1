//Time Complexity - O(1) for each operation

class Stack {

    static final int MAX = 1000;
    int top;
    int[] a = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
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

        a[top] = x;
        top++;
        return true;
    }

    int pop() {

        // If empty return 0 and print " Stack Underflow"
        if (top == 0) {
            System.out.println("Stack Underflow");
            return 0;
        }

        top--;
        return a[top];
    }

    int peek() {
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
        System.out.println(s.pop() + " Popped from stack");
    }
}
