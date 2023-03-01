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
            //Constructor here 
            this.data = data;
        }
    }

    public bool isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if (root == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void push(int data)
    {
        // Write code to push data to the stack.
        StackNode temp = new StackNode(data);

        if (root == null)
        {
            root = temp;
        }
        else
        {
            temp.next = root;
            root = temp;
        }
    }


    public int pop()
    {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (root == null)
        {
            Console.Write("\nStack Underflow");
            return 0;
        }
        StackNode temp = root;
        root = root.next;
        temp.next = null;
        return temp.data;

    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it
        if (!isEmpty())
        {
            return root.data;
        }
        else
        {
            Console.WriteLine("Stack is empty");
            return -1;
        }
    }


    // Driver code
    class Program
    {
        static void Main(String[] args)
        {
            StackAsLinkedList sll = new StackAsLinkedList();

            sll.push(10);
            sll.push(20);
            sll.push(30);

            Console.WriteLine(sll.pop() + " popped from stack");

            Console.WriteLine("Top element is " + sll.peek());

        }
    }
}

