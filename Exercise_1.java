// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if(top==-1)
        {
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
        if(top >=a.length-1)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            top++;
        }

        a[top] = x;

        System.out.println("Element pushed in the Stack: "+x);

        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(top == -1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }

        int element = a[top];
        top--;

        System.out.println("Element Popped from Stack: "+element);

        return element;
    }

    int peek()
    {
        //Write your code here
        if (top == -1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }

        return a[top];
    }
}

// Driver code
class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        System.out.println("Stack Empty? :"+s.isEmpty());
        s.push(10);
        System.out.println("Top:"+s.peek());
        s.push(20);
        System.out.println("Top:"+s.peek());
        s.push(30);
        System.out.println("Top:"+s.peek());
        System.out.println("Stack Empty? :"+s.isEmpty());
        s.pop();
        System.out.println("Top:"+s.peek());
        s.pop();
        System.out.println("Top:"+s.peek());
        s.pop();
        System.out.println("Stack Empty? :"+s.isEmpty());

    }
}