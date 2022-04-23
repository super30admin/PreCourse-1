using System;
public class StackAsLinkedList
{

    StackNode root;

    public class StackNode
    {
        public int data;
        public StackNode next;

        public StackNode(int data)
        {
            this.data = data;
        }
    }


    public bool isEmpty()
    {
        if(root == null)
        {
            return true;
        }
        return false;
    }

    public void push(int data)
    {
        StackNode newNode = new StackNode(data);
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            StackNode temp = root;
            root = newNode;
            root.next = temp;
        }
    }

    public int pop()
    {
        int popped = 0;
        //If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null)
        {
            Console.WriteLine("Stack underflow");
            return popped;
        }
        //Write code to pop the topmost element of stack.
        popped = root.data;
        root = root.next;
        //Also return the popped element
        return popped;
    }

    public int peek()
    {
        if(root == null)
        {
            Console.WriteLine("Stack is empty");
            return 0;
        }
        return root.data;
        //Write code to just return the topmost element without removing it.

    }
}
