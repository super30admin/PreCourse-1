class StackAsLinkedList {

    StackNode root = null;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.

        return this.root == null;
    }

    public void push(int data)
    {
        StackNode stackNode = new StackNode(data);

        //Write code to push data to the stack.
        if(this.root == null) {
            this.root = stackNode;
        } else {

            stackNode.next = this.root;
            this.root = stackNode;
        }
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element

        if(this.root == null) {

            System.out.println("Stack Underflow");
            return 0;
        } else {
            StackNode stackNode = this.root;
            this.root = this.root.next;
            return stackNode.data;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        return this.root != null ? this.root.data : 0;
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
