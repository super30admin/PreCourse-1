//time Complexity O(1)
//Space Complexity O(n) n is no. of elements in stack
using System;

public class StackUsingLinkedList
{
    private class Node
    {
        public int Data;
        public Node? Next;

        public Node(int data)
        {
            Data = data;
            Next = null;
        }
    }

    private Node top;

    public StackUsingLinkedList()
    {
        top = null;
    }

    // Push method
    public void Push(int value)
    {
        Node newNode = new Node(value);
        newNode.Next = top;
        top = newNode;
    }

    // Pop method
    public int Pop()
    {
        if (IsEmpty())
        {
            throw new InvalidOperationException("Stack Underflow");
        }

        int value = top.Data;
        top = top.Next;
        return value;
    }

    // Peek method
    public int Peek()
    {
        if (IsEmpty())
        {
            throw new InvalidOperationException("Stack is empty");
        }
        return top.Data;
    }

    // Check if stack is empty
    public bool IsEmpty()
    {
        return top == null;
    }

    public static void Main(string[] args)
    {
        // Create a stack of integers using a linked list
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.Push(10);
        stack.Push(20);
        stack.Push(30);

        Console.WriteLine("Popped from stack: {0}", stack.Pop());
        Console.WriteLine("Top element is {0}", stack.Peek());
    }
}

