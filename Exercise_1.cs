// Time Complexity :O(1) for all operations
// Space Complexity : O(N) where N = 1000
using System;

public class Stack
{
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static int MAX = 1000;
    int top;
    int[] a = new int[MAX]; // Maximum size of Stack 


    public Stack()
    {
        //Initialize your constructor 
        top = -1;
    }


    bool isEmpty()
    {
        //Write your code here 
        return top == -1;
    }

    bool push(int x)
    {
        //Check for stack Overflow
        if (top == MAX - 1)
        {
            Console.WriteLine("Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty())
        {
            Console.WriteLine("Stack Underflow");
            return 0;
        }
        return a[top--];
    }

    int peek()
    {
        //Write your code here
        if (isEmpty())
        {
            return 0;
        }
        return a[top];
    }
    // Driver code 

    public static void Main(string[] args)
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        Console.WriteLine(s.pop() + " Popped from stack");
        Console.WriteLine(s.peek() + " Peeked from stack");
    }
}









