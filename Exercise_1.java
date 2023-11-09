// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes - used IntelliJ
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 2;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        //Write your code here
        return top == 0;
    }

    Stack() {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        //Check for stack Overflow
        //Write your code here
        if (top == MAX - 1) {
            return false;
        }
        top++;
        a[top] = x;

        return true;
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top == -1) {
            System.out.println(" Stack Underflow");
            return 0;
        }
        int temp = a[top];
        a[top] = 0;
        top--;
        return temp;
    }

    int peek() {
        //Write your code here
        return a[top];
    }


}

class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is " + s.peek());
    }
}

