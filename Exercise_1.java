class Stack {
    // Time Complexity: O(1) for all operations
    // Space Complexity: O(n), where n is MAX (1000)

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    // Constructor
    Stack() {
        top = -1; // stack is initially empty
    }

    // Check if the stack is empty
    boolean isEmpty() {
        return (top < 0);
    }

    // Push an element onto the stack
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    // Pop an element from the stack
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    }

    // Peek at the top element without removing it
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
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
