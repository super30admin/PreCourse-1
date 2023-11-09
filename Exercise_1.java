//Time Complexity : o(1)
//Space Complexity : o(n)
//Did this code successfully run on Leetcode : Haven't tried
//Any problem you faced while coding this : No

public class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }

}

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return (top == -1);
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        top++;
        a[top] = x;
        return true;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int topValue = a[top];
        top--;
        return topValue;

    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top];
    }
}
