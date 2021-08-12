class Stack {
    static final int MAX = 2;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        if (this.top == 0)
            return true;
        return false;
    }

    Stack() {
        this.top = 0;
        // Initialize your constructor
    }

    boolean push(int x) {

        // Check for stack Overflow
        // Write your code here
        if (this.top >= MAX) {
            System.out.println("Stack Overflow");
            return false;
        }

        a[this.top] = x;
        this.top += 1;
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (this.isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int temp = a[this.top - 1];
        a[this.top - 1] = 0;
        this.top -= 1;
        return temp;
    }

    int peek() {
        // Write your code here
        return a[this.top];
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
