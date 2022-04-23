//Time complexity for pushing is O(1) popping is O(1) and peeking is O(1)
//Space complexity for n elements is O(n), for one element is O(1)
class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        if (top == -1)
            return true;
        else
            return false;
    }

    Stack() {
        // Initialize your constructor
        top = -1;

    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top == a.length - 1)
        {
            System.out.println("stack overflow");
            return false;
        }
            
        else {
            a[++top] = x;
            return true;
        }

    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (top == -1) {
            System.out.println("underflow");
            return 0;
        }

        else
            return a[top--];

    }

    int peek() {
        // Write your code here
        if (top == -1)
            return 0;
        else
            return a[top];

    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        // System.out.println("check check");
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
