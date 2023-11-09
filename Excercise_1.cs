using System;

public class Stack
{
    static readonly int MAX = 1000;
    int top;
    int[] a = new int[MAX];

    bool IsEmpty()
    {
        //Write your code here 
        return (top < 0);
    }
    public Stack()
    {
        //Initialize your constructor 
        top = -1;
    }
    public bool Push(int data)
    {
        // Check for stack Overflow
        //Write your code here
        if (top >= MAX)
        {
            Console.WriteLine("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = data;
            return true;
        }
    }

    public int Pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top < 0)
        {
            Console.WriteLine("Stack Underflow");
            return 0;
        }
        else
        {
            int value = a[top--];
            return value;
        }
    }

    public void Peek()
    {
        //Write your code here
        if (top < 0)
        {
            Console.WriteLine("Stack Underflow");
            return;
        }
        else
            Console.WriteLine("The topmost element of Stack is : {0}", a[top]);
    }


    class Program
    {
        static void Main(string[] args)
        {
            Stack myStack = new Stack();

            myStack.Push(10);
            myStack.Push(20);
            myStack.Push(30);
            myStack.Peek();
            Console.WriteLine("Item popped from Stack : {0}", myStack.Pop());
        }
    }
}