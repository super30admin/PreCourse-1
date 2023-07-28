// Time Complexity : Insert = O(1) , Peek = O(1), Pop=O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 5;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        //Write your code here
        return top == -1;
    }

    Stack() {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        //Check for stack Overflow
        //Write your code here
        if (top == MAX - 1)
            return false;
        if (top == -1) {
            top = 0;
            a[top] = x;
        } else {
            top++;
            a[top] = x;
        }
        return true;
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int popValue = a[top];
            top--;
            return popValue;
        }
    }

    int peek() {
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
        s.push(40);
        s.push(50);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");

        s.push(100);
        s.push(200);
        s.push(300);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");

    }
}
