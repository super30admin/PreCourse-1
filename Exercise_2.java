class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.

        return (root == null);
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if(root == null){
            root = node;
        }
        else{
            StackNode temp = root;
            root = node;
            node.next = temp;
        }
        System.out.println("pushed to stack: "+data);
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element

        StackNode node = root;
        if(node != null) {
            int x = node.data;
            root = node.next;
            return x;
        }
        else{
            System.out.println("pop function: No elements found in Stack");
            return 0;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        StackNode peekNode = root;
        if(peekNode != null) {
            int x = peekNode.data;
            return x;
        }
        else{
            System.out.println("peek function: No elements found in Stack");
            return 0;
        }
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
