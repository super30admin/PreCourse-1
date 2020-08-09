class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return top == -1;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        // Overflow condition
        if (top == MAX - 1) {
            return false;
        }

        a[++top] = x;
        return true;

    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int x = a[top--];
        return x;

    }

    int peek() {
        if (top == -1) {
            return 0;
        }
        int x = a[top];
        return x;

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
