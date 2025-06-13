// Time Complexity : O(1) for push, pop, peek
// Space Complexity : O(n) , n=MAX=1000
class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return (top < 0);

    }

    // Constructor to initialize stack
    Stack() {
        top = -1;
    }

    // push operation to add an element to the stack
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x; // Increment top and insert element
            return true;
        }
    }

    // Pop operation to remove and return the top element
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    }

    // Peek operation to return the top element without removing it
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
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
