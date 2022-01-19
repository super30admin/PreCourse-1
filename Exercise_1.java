class Stack_Custom {
    // Time Complexity : O(1) for push, pop, peek
    // Space Complexity : MAX_SIZE_OF_ARRAY + temp variables
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : While compiling on leetcode, I faced error /** Line -26: error: Stack is already defined in this compilation unit [in Exercise_1.java]
    //import java.util.Stack; **/; so renamed the stack class since it is predefined class


    static final int MAX = 1000;
    int top;
    int defaultEmptyValue = -1;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        //Write your code here
        return (top == defaultEmptyValue);
    }

    Stack_Custom() {
        //Initialize your constructor
        top = defaultEmptyValue; // Initializing top with -1
        System.out.println("Stack initialized isEmpty : " + isEmpty() + " with Stack Size " + a.length);
    }

    boolean push(int x) {
        //Check for stack Overflow
        int stackLength = a.length - 1;
        if (top < stackLength) {
            top = top + 1;
            a[top] = x;
            System.out.println("Pushed elem :" + x);
            return true;
        } else {
            System.out.println("Stack is Full, could not push : " + x);
            return false;
        }
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int popElem = a[top];
        top = top - 1;
        return popElem;
    }

    int peek() {
        //If stack not empty then returning the top element
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return a[top];
        }
    }
}

// Driver code 
class Exercise_1 {
    public static void main(String args[]) {
        Stack_Custom s = new Stack_Custom();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peeked from stack");
    }
}
