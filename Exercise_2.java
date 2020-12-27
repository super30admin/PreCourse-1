class StackAsLinkedList {

    StackNode root;

    StackAsLinkedList(){
        this.root = null;
    }

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
        return (this.root == null);
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode stackNode = new StackNode(data);
        if(root == null)
            root = stackNode;
        else{
            stackNode.next = root.next;
            root.next = stackNode;
        }
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
       if(root == null){
           System.out.println("Stack underflow");
           return 0;
       }
       int data = root.data;
       root = root.next;
       return data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(this.root != null)
            return this.root.data;
        else
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
