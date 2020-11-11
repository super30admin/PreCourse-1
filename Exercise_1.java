// Time Complexity :O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : none


public class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if(top<=0)
            return true;
        else
            return false;
    }

    Stack()
    {
        //Initialize your constructor
        top=0;

    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(top<1000){
        a[top]=x;
        top++;
        return true;
        }
        return false;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return a[--top];
    }

    int peek()
    {
        //Write your code here
        if(top!=0)
            return a[top-1];
        else
            return 0;
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