
// Time Complexity : isEmpty - O(1), push - O(1), pop - O(1), peek - O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :not really, but i had to think for a bit on how i will implement it as this was the first time i implement the stack, once i could visualise the stack operations in my mind it was easy to code

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 5;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // simplified the logic
        return top == -1;
    }

    Stack() {
        this.top = -1;
    }

    boolean push(int x) {
        boolean pushed;
        if (top == (MAX - 1)) {
            System.out.println("Stack overflow");
            pushed = false;
        } else {
            top++;
            a[top] = x;
            pushed = true;
        }

        return pushed;
    }

    int pop() {
        int value;
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        } else {
            value = a[top];
            top--;
        }
        return value;
    }

    int peek() {
        int value;
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        } else {

            value = a[top];
        }
        return value;
    }
}

// Driver code
class Exercise_1 {
    public static void main(String args[]) {
        Stack s = new Stack();
        System.out.println(s.peek());
        s.push(10);
        System.out.println(s.peek());
        s.push(20);
        System.out.println(s.peek());
        s.push(30);
        System.out.println(s.peek());
        s.push(40);
        System.out.println(s.peek());
        s.push(50);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());
        s.push(60);
        System.out.println(s.peek());

    }
}
