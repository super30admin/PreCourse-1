class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty() {
        return top == 0;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top == MAX - 1) {
            System.out.println(" Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println(" Stack Underflow");
            return 0;
        }

        return a[top--];
    }

    int peek() {
        return isEmpty() ? 0 : a[top];
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
