// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return top == 0;
    }

    Stack()
    {
        //Initialize your constructor
        top = 0; // initializing top element to 0
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here

        //check if array is full. if not, assign x to top and increase top by 1

        if(top == 1000) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[top] = x;
            top = top+1;
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        //check if array is empty. if not, get the top element and assign top element to 0 and reduce top (for removal).
        if(top == 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int ele = a[top - 1];
            a[top -1] = 0;
            top = top -1;
            return ele;
        }
    }

    int peek()
    {
        //Write your code here
        ////check if array is empty. if not, return top element for peek.
        if(top == 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top - 1];
        }

    }
}

// Driver code
class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
    }
}
