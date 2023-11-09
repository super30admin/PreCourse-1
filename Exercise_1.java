// Time and Space Complexity:
// time complexity for operations such as push, pop, peek and isEmpty = O(1)
// Space comeplexity for the above operations is also O(1). However, the space complexity of stack implementation using an array is O(N), where N is the maximum capacity of the stack (MAX in our case). 

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        return top == -1;
    }

    Stack() {
        // Initialize your constructor
        top = -1;
        a = new int[MAX];
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top == MAX - 1) {
            System.out.println("Stack is full");
            return false;
        }

        a[++top] = x;
        System.out.println(x + " pushed to stack");
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot perform pop operation.");
            return 0;
            // return Integer.MIN_VALUE/2;
            // throw new IllegalStateException("Stack is empty. Cannot perform pop
            // operation.");
        }
        return a[top--];
    }

    int peek() {
        // Write your code here
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return a[top];
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        // System.out.println(s.pop() + " Popped from stack");
        System.out.println("Peek: " + s.peek());
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
