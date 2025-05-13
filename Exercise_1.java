// Time Complexity:
// push, pop, peek, isEmpty -> O(1)

// Space Complexity
// O(n) -> n is MAX (max size of stack) 

class Stack {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // check if top is less than 0
        if (top < 0) {
            return true;
        }
        return false;
    }

    Stack() {
        // Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        // check if stack is full ? "overflow" : top + 1
        if (top >= MAX - 1) {
            System.out.println("Stack overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop() {
        // check if stack isEmpty ? "underflow" : top - 1
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        return a[top--];
    }

    int peek() {
        // if stack isEmpty ? "empty" : top
        if (top < 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return a[top];
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
