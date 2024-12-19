//Time Complexity: push, pop, isEmpty, peek -> O(1) for all four methods
//Space Complexity: O(MAX), where MAX is size of array, for the array.

class Stack {
    static final int MAX = 1000;
    int top;
    int[] a = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return top == -1;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top == (MAX - 1)) {
            System.out.println("Stack overflow");
            return false;
        }
        a[top + 1] = x;
        top = top + 1;
        return true;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int topElement = a[top];
        top = top - 1;
        return topElement;
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
    }
}
