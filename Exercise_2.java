class StackAsLinkedList {

    StackNode root;

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
        if (root == null){
            System.out.println("Stack is empty ");
            return true;
        }
       return false;
    }

    public void push(int data) {
        if (root == null) {
            root = new StackNode(data);
        } else {
            StackNode nextNode = root;
            while (nextNode.next != null) {
                nextNode = nextNode.next;
            }
            nextNode.next = new StackNode(data);
        }
    }

    public int pop()
    {
        if(root ==null)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            StackNode nextNode = root;
            StackNode prev = null;
            while(nextNode.next != null)
            {
                prev = nextNode;
                nextNode = nextNode.next;

            }
            prev.next = null;
            return (nextNode.data);

        }
        return 0;
    }

	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element


    public int peek()
    {

        if(root ==null)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            StackNode nextNode = root;

            while(nextNode.next != null)
            {

                nextNode = nextNode.next;

            }

            return (nextNode.data);

        }
        return 0;
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
