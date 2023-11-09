// Time Complexity : Insert(Push) - O(1), Delete(Pop) - O(1),
// Space Complexity : O(Max)
// Did this code successfully run on Leetcode : Did not found problem
// Any problem you faced while coding this : no

class Stack {
    static final int MAX = 3;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        // Checks for top
        if(top==-1)
        {
            return true;
        }
        return false;
    }

    Stack()
    {
        //Initialize top
        top=-1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if(top>=MAX-1)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
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
        //Write your code here
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return 0;
        }
        return a[top];
    }


// Driver code

    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peek from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peek from stack");
    }
}
