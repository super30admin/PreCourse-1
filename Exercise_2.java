class StackAsLinkedList
{

    StackNode root;

    int length = 0;

    static class StackNode
    {

        int data;

        StackNode next;

        StackNode(int data)
        {
            this.data = data;
        }
    }

    public boolean isEmpty()
    {
        return length == 0;
    }

    public void push(int data)
    {
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
        length++;
    }

    public int pop()
    {
        int val = 0;
        if (isEmpty())
            return 0;
        else
        {
            val = root.data;
            root = root.next;
            length--;
        }
        return val;
    }

    public int peek()
    {
        if (isEmpty())
            return 0;
        else
            return root.data;
        //Write code to just return the topmost element without removing it.
    }

    //Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        //System.out.println(sll.pop() + " popped from stack");
        int a = sll.pop();
        int b = sll.pop();
        int c = sll.pop();
        System.out.println("Top element is " + a);
        System.out.println("Top element is " + b);
        System.out.println("Top element is " + c);
        int d = sll.pop();
        System.out.println("__D____:"+d);
    }
} 
