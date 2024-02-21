// Time Complexity : O(1) for push, pop, peek functions
// Space Complexity : O(1) - since we're using fixed memory size
// Did this code successfully run on Leetcode : No corresponding leetcode problem
// Any problem you faced while coding this : No
class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        return top == -1;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top + 1 >= MAX) {
            System.out.println("Stack overflow, cannot add the value : " + x);
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        }
        return a[top--];
    }

    int peek() {
        if (this.isEmpty()) {
            return -1;
        }
        return a[top];
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
