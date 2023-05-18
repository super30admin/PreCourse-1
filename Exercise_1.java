class Stack {

    // Time Complexity :
        //1. push(): O(1) as insertion into an Array at an index takes O(1)
        //2. pop(): O(1) as deletion at an index from array takes O(1)
        //3. peek(): O(1) as accessing an array at an index takes O(1)
    // Space Complexity : O(n) where n is the size of the Array which in this case is 1000
    // Did this code successfully run on Leetcode : N/A
    // Any problem you faced while coding this :
    // Your code here along with comments explaining your approach:
    //1. made one assumption that the peek() method returns 0 when the stack is empty

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if(this.top == -1)
        {
            return true;
        }
        return false;
    }

    Stack()
    {
        //Initialize your constructor
        top = -1; //empty stack
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if(this.top >= MAX-1)
        {
            //overflow
            System.out.println("Stack overflow! Exceeded the upper limit of " + MAX);
            return false;
        }

        //Write your code here
        a[++ this.top] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        return a[this.top--];
    }

    int peek()
    {
       if(isEmpty())
       {
           System.out.println("Stack is empty!");
           return 0; //returning 0 if the stack is empty as we're doing in the Pop() method
       }
       return a[this.top];
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
    }
}
