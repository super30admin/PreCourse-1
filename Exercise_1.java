
// TC for peek,pop ,push is O(1)
//  SC is O(1)

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        return a.length < MAX - 1;

    }

    Stack() {

        // Initialize your constructor

    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top == MAX - 1) {
            return false;
        }
        a[top++] = x;
        return true;

    }

    int pop() {

        // If empty return 0 and print " Stack Underflow"
        if (top == 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // Write your code here
        top--;
        return a[top];
    }

    int peek() {
        // Write your code here
        return a[top];
    }
}

// Driver code
class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}


