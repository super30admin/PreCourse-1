class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    // O(1)
    boolean isEmpty() {
        // Write your code here
        return top < 0;
    }

    Stack() {
        // Initialize your constructor
        this.top = -1;
    }

    // O(1)
    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top == MAX) {
            System.out.println("Stack Overflowed..!!");
            return false;
        } else {
            top++;
            a[top] = x;
            return true;
        }
    }

    // O(1)
    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (top < 0) {
            System.out.println(" Stack Underflow");
            return 0;
        } else {
            top--;
            return a[top + 1];
        }
    }

    // O(1)
    int peek() {
        // Write your code here
        if (top < 0) {
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
    }
}
