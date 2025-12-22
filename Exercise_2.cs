
//Time Complexity - O(1)
//Space Complexity - O(n)
public class StackAsLinkedList
{

    StackNode root;

    private class StackNode
    {
        public int data;
        public StackNode next;

        public StackNode(int data)
        {
            //Constructor here 
            this.data = data;
            next = null;
        }
    }


    public bool isEmpty()
    {
        return root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack. 
        StackNode st = new StackNode(data);
        st.next = root;
        root = st;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element 
        if (isEmpty())
        {
            Console.WriteLine("Stack Underflow");
            return 0;
        }
        int popped = root.data;
        root = root.next;
        return popped;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if (isEmpty())
        {
            Console.WriteLine("Stack Underflow");
            return 0;
        }
        return root.data;
    }

    //Driver code
    public static void Main(String[] args)
    {
        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        Console.Write(sll.pop() + " popped from stack");

        Console.Write("Top element is " + sll.peek());
    }
} 
