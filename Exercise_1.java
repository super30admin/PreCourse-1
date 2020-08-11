class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        if (top == -1)
            return true;
        else
            return false;
    }

    Stack() {
        // Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        if (top + 1 == MAX)
            return false;
        // Write your code here
        top++;
        a[top] = x;
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // Write your code here
        int temp = a[top];
        top--;
        return temp;
    }

    int peek() {
        // Write your code here
        if (!isEmpty()) {
            return a[top];
        } else
            return 0;
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
