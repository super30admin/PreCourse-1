// Time Complexity :o(1)
// Space Complexity : o(n)
class Stack {
    // Algorithm -
    // To implement a stack using an array, initialize an array and treat its end as
    // the stack’s top.
    // Implement push (add to end), pop (remove from end), and peek (check end)
    // operations, handling cases for an empty or full stack

    static final int MAX = 1000;
    int top; // last position of array to represent top of the stack
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        return top < 0;
    }

    Stack() {
        // Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }

    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        // Write your code here
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
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
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
    }
}
