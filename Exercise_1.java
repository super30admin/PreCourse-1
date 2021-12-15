package Precourse1;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Tested successfully on local code editor. No exact question on LC.
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//I have intialized top to -1 in the constructor, it means stack is currently empty.
//for isEmpty() method, checked if top == -1, return true
//before pushing anything to the stack, checked if push will not exceed MAX, then pushed to the stack by incrementing top
//for popping elements from the stack, checked if stack is not empty, then popped else returned -1
//for peeking elements from the stack, checked if stack is not empty, then peeked else returned -1


class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Precourse1.Stack

    boolean isEmpty()
    {
        //Write your code here
        if(top == -1) {
            return true;
        }
        return false;
    }

    Stack()
    {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(top < MAX-1) {
            a[++top] = x;
            return true;
        }
        return false;
    }

    int pop()
    {
        //If empty return 0 and print " Precourse1.Stack Underflow"
        //Write your code here
        if(isEmpty()) {
            return -1;
        }
        return a[top--];
    }

    int peek()
    {
        //Write your code here
        if(isEmpty()) {
            return -1;
        }
        return a[top];
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
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peeked from stack");

    }
}
