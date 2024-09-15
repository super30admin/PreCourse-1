//Time complexity O(1)
//Space Complexity O(n) where size of the stack

using System;

public class StackUsingArray
{
    static readonly int MAX = 1000;
    public int[] stackArray;
    public int top;

    public StackUsingArray()
    {
        //stack is initially empty
        top = -1;
        stackArray = new int[MAX];
    }

    public void Push(int x)
    {
        if (top >= (MAX - 1))
        {
            throw new InvalidOperationException("Stack Overflow");
        }
        stackArray[++top] = x;
    }
    public int Pop()
    {
        if (IsEmpty())
        {
            throw new InvalidOperationException("Stack Underflow");
        }
        return stackArray[top--];
    }
    public void Peek()
    {
        if (IsEmpty())
        {
            throw new InvalidOperationException("Stack is Empty");
        }

    }

    // Check if stack is empty
    public bool IsEmpty()
    {
        return top == -1;
    }

    public static void Main(string[] args)
    {
        StackUsingArray obj = new StackUsingArray();

        obj.Push(10);
        obj.Push(20);
        obj.Push(30);

        Console.WriteLine("Popped from stack {0}", obj.Pop());

    }

}
