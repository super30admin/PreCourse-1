class Stack {
    // Please read sample.java file before starting.
    //  Time complexity of push(), pop(), peek() are big O(1).
    //  Space complexity is also O(1).
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    Stack() {
        top = -1;// empty stack
    }

    boolean push(int x) {
        // Check for stack Overflow
        // check if stack is full
        if (top >= MAX) {//check for MAX stack top value
            System.out.println("push Stack Overflow");
            return false;
        }
        top++;// increment stack
        a[top] = x;
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if (top < 0) {
            System.out.println("stack underflow");
            return 0;
        }
        top = top - 1;
        return a[top];
    }

    int peek() {
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
        System.out.println("---------------" + s.peek());
    }
}