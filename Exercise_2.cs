public class StackAsLinkedList
{
    // Time Complexity : O(1)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode :
    // Any problem you faced while coding this : No problems as such but needed to refresh my knowledge on Linked list and Stack

    StackNode root;

    public class StackNode
    {
        public int data;
        public StackNode next;

        public StackNode(int x)
        {
            //Constructor here
            data = x;
        }
    }

    public bool IsEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void Push(int x)
    {
        //Write code to push data to the stack.
        StackNode node = new StackNode(x);
        if (root == null)
        {
            root = node;
        }
        else
        {
            node.next = root;
            root = node;
        }

    }

    public int Pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element 
        if (root == null)
        {
            Console.WriteLine("Stack underflow");
            return 0;
        }
        else
        {
            int poppedValue = root.data;
            root = root.next;
            return poppedValue;
        }
    }

    public int Peek()
    {
        //Write code to just return the topmost element without removing it.
        if (root == null)
        {
            Console.WriteLine("Stack is empty");
            return 0;
        }
        else
        {
            return root.data;
        }
    }
}

// Driver code 
public class Program
{  
    public static void Main(string[] args)
    {
        StackAsLinkedList sll = new StackAsLinkedList();
        sll.Push(10);
        sll.Push(20);
        sll.Push(30);
        Console.WriteLine(sll.Pop().ToString() + " Popped from stack");
    }
}
       
