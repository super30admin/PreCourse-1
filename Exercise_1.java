// Time Complexity : pop - O(1), push - O(1), peek - O(1)
// Space Complexity : pop - O(1), push - O(1), peek - O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if (a.length == 0 || top == -1 || top < 0) {
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
        top++;
        if(top<=MAX) {
            a[top] = x;
            return true;
        }
        System.out.println("Stack to full, cannot push a new element");
        return false;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        int retValue;
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            retValue= a[top];
            top--;
            return retValue;
        }
    }

    int peek()
    {
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else if (top > MAX) {
            System.out.println("Stack is full");
            return -1;
        } else {
            return a[top];
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
        s.push(33);
        s.pop();
        System.out.println("Peek of stack is " + s.peek());
        s.pop();
        System.out.println(s.pop() + " Popped from stack");
    }
}
