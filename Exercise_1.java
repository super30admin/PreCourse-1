/**
 * TC: O(1)
 * SC:o(1000)
 */
class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
    int count = 0;

    boolean isEmpty() {
        // Write your code here
        return count == 0;
    }

    Stack() {
        // Initialize your constructor
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (count < 1000) {
            a[count - 1] = x;
            count++;
            return true;
        } else {
            System.out.print("Stack Overflow");
            return false;
        }

    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (!isEmpty()) {
            int temp = a[count - 1];
            a[count - 1] = 0;
            count--;
            return temp;
        }

        System.out.println("Stack Underflow");
        return -1;

    }

    int peek() {
        // Write your code here
        if (!isEmpty()) {
            int temp = a[count - 1];
            return temp;
        }
        return -1;
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
