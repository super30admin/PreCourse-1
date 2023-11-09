class Stack {
    // The space and time complexity to push and pop is O(1)
    // Generally if there are N elements in an array the space and time complexity
    // to push and pop will be O(N)
    // To peek an element the time complexity will be O(1)
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        if (top == -1)
            return true;
        else {
            return false;
        }
    }

    // Write your code here
    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top < MAX - 1) {
            a[++top] = x;
            return true;
        } else {
            return false;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int element = a[top--];
            return element;
        }
    }

    int peek() {
        if (isEmpty()) {
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
