class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data = data;
        }
    }

    // TC O(1)
    public boolean isEmpty()
    {
        return root == null;
    }

    // TC - O(1)
    public void push(int data)
    {
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    }

    // TC O(1)
    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(root == null) {
            System.out.println("Stack underflow");
            return 0;
        }

        int temp = root.data;
        root = root.next;
        return temp;
    }

    // TC O(1)
    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        return root == null ? 0 : root.data;
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
