class Stack {
    // time complexity => O(1)
    // space complexity => O(1)

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    // time complexity => O(1)
    // space complexity => O(1)
    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    Stack() {
        // Initialize your constructor
        top = -1;

    }

    // time complexity => O(1)
    // space complexity => O(1)
    boolean push(int x) {
        if (top < 999) {
            a[++top] = x;
            return true;
        } else {
            // stack overflow
            return false;
        }

    }

    // time complexity => O(1)
    // space complexity => O(1)
    int pop() {
        if (isEmpty()) {

            System.out.println("Stack Underflow");
            return 0;
        } else {
            top--;
            return a[top + 1];

        }

    }

    // time complexity => O(1)
    // space complexity => O(1)

    int peek() {
        if (top > -1) {
            return a[top];
        } else {
            // Stack empty
            return 0;
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
