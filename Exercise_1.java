
// Time Complexity:
// push() -> O(1)
// pop()  -> O(1)
// peek() -> O(1)
// isEmpty() -> O(1)
//
// Space Complexity: O(MAX)

import java.util.*;

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    Stack() {               // Constructor here
        top = -1;
    }

    boolean push(int x) {
        //Your code here
        //Check Stack overflow as well
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop() {
        //Your code here
        //Check Stack Underflow as well
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return a[top--];
    }

    int peek() {
        //Your code here
        //Check empty condition too
        if (top < 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return a[top];
    }

    boolean isEmpty() {
        //Your code here
        return (top < 0);
    }
}

public class Exercise_1 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}

