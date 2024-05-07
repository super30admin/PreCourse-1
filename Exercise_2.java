class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
           this.data = data;
           next=null;
        }
    }


    public boolean isEmpty()
    {
        if(root==null)
            return true;
        else
            return false;
    }

    public void push(int data)
    {
        StackNode Node= new StackNode(data);
        if(root==null)
        {
            root=Node;
        }
        Node.next=root;
        root=Node;

    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode temp=root;
        root=root.next;
        return temp.data;
    }

    public int peek()
    {
        if(isEmpty()) {
            return 0;
        }
        return root.data;
    }

	//Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
