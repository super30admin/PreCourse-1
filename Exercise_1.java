class Exercise_1 {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    /*
     * Time complexity for push is O(1) and space is also O(1).
     * Time complexity for pop is O(1).
     * * Time complexity for peek is O(1).
     */
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        return (top < 0);
    }

    Exercise_1() {
        // Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        if (top >= MAX - 1) {
            System.out.println("Stack-Overflow");
            return false;
        }
        // Write your code here
        else {
            ++top;
            a[top] = x;
            return true;
        }
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // Write your code here
        else {
            return a[top--];

        }
    }

    int peek() {
        // Write your code here
        return a[top];
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Exercise_1 s = new Exercise_1();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
