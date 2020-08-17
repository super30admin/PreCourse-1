class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        if (a.length == 0) {
            return true;
        }
        return false;
    }

    Stack() {
        // Initialize your constructor
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        for (int i = 0; i < MAX; i++) {
            if (a[top] == 0) {
                a[top] = x;
                top++;
            }
            return true;
        }
        return false;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        int popElement;
        if (a.length == 0) {
            return 0;
        } else {
            popElement = top;
            top--;
            return a[--popElement];
        }

    }

    int peek() {
        // Write your code here
        if (a.length == 0) {
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
