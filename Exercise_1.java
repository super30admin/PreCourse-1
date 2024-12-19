// Time Complexity : O(1) for all methods
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes (ran it on my local IntelliJ)
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
//Exercise_1 : Implement Stack using Array

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        if(top == -1)
        {
            return true;
        }
        return false;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        //Check for stack Overflow
        //Write your code here
        if (top == a.length - 1) {
            System.out.println("stack Overflow");
            return false;
        }
        a[top + 1] = x;
        top++;
        return true;
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //newElement is a temp variable, assigning the top element to temporary variable,
        // and popping the element, so that top element can be returned after it is popped out.
        int newElement = a[top];
        top--;
        return newElement;
    }

    int peek() {
        //Write your code here
        //checks if empty and prints " Stack Underflow" if stack is empty.
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
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