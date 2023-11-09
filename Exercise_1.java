// Time Complextity: Push/Pop/Peek - O(1)
// Space Complexity: O(n)
// Ran successfully on leetcode: Question is not on leetcode
// Any problems: No

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        boolean isEmpty = (top < 0);
        return isEmpty;
    }

    Stack() {
        // Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        if (top == MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        // Write your code here
        a[++top] = x;
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // Write your code here
        int topValue = a[top--];
        return topValue;
    }

    int peek() {
        // Write your code here
        if (top < 0) {
            System.out.println("No elements");
            return 0;
        }
        int topValue = a[top];
        return topValue;
    }
}

// Driver code
class Exercise_1 {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
