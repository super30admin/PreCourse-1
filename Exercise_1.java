// Time Complexity: 
// push() - O(1), pop() - O(1), peek() - O(1), isEmpty() - O(1)
// Space Complexity: O(n) where n = MAX

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    // Constructor to initialize top
    Stack() {
        top = -1;
    }

    // Check if the stack is empty
    boolean isEmpty() {
        return top < 0;
    }

    // Push element onto stack
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    // Pop element from stack
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    }

    // Return top element without removing it
    int peek() {
        if (top < 0) {
            System.out.println("Stack is Empty");
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
