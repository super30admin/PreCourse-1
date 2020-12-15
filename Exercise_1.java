/**
 * Time Complexity: Push = O(1), Pop = O(1); 
 * Space Complexity = Push = O(1), Pop = O(1)
 */

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        if (top < 0) {
            return true;
        }

        return false;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top == MAX - 1) {
            System.out.println("Stack full. No push possible");
            return false;
        }

        a[++top] = x;
        return true;

    }

    int pop() {
        // If empty return 0 and print "Stack Underflow"
        // Write your code here
        if (top < 0) {
            System.out.println("Stack Empty. No pop pssible");
            return -1;
        }

        return a[top--];
    }

    int peek() {
        // Write your code here
        return a[top];
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
