import java.util.Arrays;

// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == MAX - 1;
    }

    boolean push(int x) {
        // Check for stack Overflow
        if (isFull()) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;

    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    }

    int peek() {
        // If empty return 0 and print " Stack Underflow"
        if(isEmpty()) return 0;
        return a[top];
    }

    void print(){
        System.out.println(Arrays.toString(a));
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        System.out.println(s.peek() + " peek value from stack"); 
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek() + " peek value from stack"); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " peek value from stack"); 
    }
}
