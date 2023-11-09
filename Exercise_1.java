// Time Complexity : O(1)
// Space Complexity : O(N)
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
        return (top == -1);
    }
    boolean isFull()
    {
        return (top == MAX - 1);
    }
    Stack()
    {
        top = -1;
    }
    Boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if (isFull())
        {
            System.out.println("Stack Overflow");
            return false;
        }
        top =top+1;
        a[top] =x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    }

    int peek()
    {
        if (!isEmpty())
            return a[top];
        else
            return -1;
    }
}


public class Exercise_1 {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }

}
