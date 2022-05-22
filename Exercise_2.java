class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data=data;
            this.next=null;
        }
    }


    public boolean isEmpty()
    {
        return this.root==null;
        //Write your code here for the condition if stack is empty.
    }

    public void push(int data)
    {
        StackNode node=new StackNode(data);
        if (isEmpty()){
            this.root =node;
        }
        else {
            node.next=root;
            root=node;
        }
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (isEmpty()){
            return 0;
        }else {
            int popData=root.data;
            root=root.next;
            return popData;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
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
