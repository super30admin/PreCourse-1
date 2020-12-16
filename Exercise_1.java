class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return this.top == -1;
    }

    Stack() {
        this.top = -1;
    }

    boolean push(int x) {
        if (this.top == MAX - 1)
            return false;
        a[++this.top] = x;
        return true;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[this.top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        return a[this.top];
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek() + " Peek from stack");
    }
}
