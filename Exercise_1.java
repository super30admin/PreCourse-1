class Stack {
    static final int MAX = 1000;
    int top;
    int size;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        return top == -1;
    }

    Stack() {
        // Initialize your constructor
        top = -1;
        size = 0;
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top + 1 == MAX)
            return false;
        top++;
        a[top] = x;
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (top == -1) {
            System.out.print("Stack Underflow");
            return 0;
        }

        int num = a[top];
        top--;
        return num;
    }

    int peek() {
        // Write your code here
        return a[top];
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(a[i] + " ");
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
