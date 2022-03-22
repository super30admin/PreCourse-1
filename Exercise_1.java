
class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    // Did this code successfully run on Leetcode : yes ran on IDE

    static final int MAX = 1000;
    int top = -1;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Time Complexity : 0(1)

        if (top == -1) {
            return true;
        }
        return false;
        //Write your code here 
    }

    Stack() {

        //Initialize your constructor 
    }

    boolean push(int x) {
        // Time Complexity : 0(1)
        // Space Complexity : 0(1)

        if (top < MAX - 1) {
            a[top + 1] = x;
            top = top + 1;
            return true;
            //Check for stack Overflow
            //Write your code here
        } else {
            System.out.println("stack overflow");
            return false;
        }
    }

    int pop() {
        // Time Complexity : 0(1)
        // Space Complexity : 0(1)
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int topValue = a[top];
        a[top] = 0;
        top = top - 1;
        return topValue;
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    }

    int peek() {
        // Time Complexity : 0(1)
        //Write your code here
        if (top != -1) {
            return a[top];
        }
        return 0;
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
