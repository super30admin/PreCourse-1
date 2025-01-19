// Time Complexity :ALL operations run in O(1) and print operations runs in O(N)
// Space Complexity : O(N) where N is number of elements in stack
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
            this.next = null;
        }
    }

    public bool isEmpty()
    {
        //Write your code here for the condition if stack is empty. 
        return root == null;
    }

    public void push(int data)
    {
        StackNode newNode = new StackNode(data);
        //Write code to push data to the stack. 
        if (root == null)
        {
            root = newNode;
        }
        else
        {
            newNode.next = root;
            root = newNode;
        }
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (root == null)
        {
            Console.WriteLine("Stack Underflow");
            return 0;
        }

        //Write code to pop the topmost element of stack.
        //Also return the popped element 
        int popedElement = root.data;
        root = root.next;
        return popedElement;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        return root.data;
    }

    //Driver code
    public static void Main(string[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        Console.WriteLine(sll.pop() + " popped from stack");

        Console.WriteLine("Top element is " + sll.peek());
    }
}




