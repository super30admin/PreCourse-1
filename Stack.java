
public class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        if (top < 0) {
            return true;
        } else
            return false;

    }

    Stack() {
        // Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        if (top == MAX - 1) {
            System.out.println("Stack overflow");
            return false;
        }

        // Write your code here

        top++;
        a[top] = x;
        System.out.println(x + " is pushed to the stack");
        return true;

    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        // Write your code here
        else {
            int x = a[top];
            top--;
            return x;
        }

    }

    int peek() {
        // Write your code here
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }

        return a[top];
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop() + " Popped from stack");
        // System.out.println(" Top element is :" + st.peek());
    }
}
