/**
 * Create a stack data structure using linkedlist
 */
class StackAsLinkedList {
    //this acts as a top
    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
           this.data=data;
           next=null;
        }
    }

    /**
     * Method to check whether stack is empty or not
     * @return true when stack is empty else returns false
     */
    public boolean isEmpty()
    {
        return root==null;
    }

    /**
     * Push the data into stack
     * @param data
     */
    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode node=new StackNode(data);
        if (root != null) {
            node.next = root;
        }
        root=node;

    }

    /**
     * pop/remove the top element from the stack
     * @return popped element
     */
    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        int data=0;
        if(root==null) {
            System.out.println("Stack Underflow");
        }else{
             data=root.data;
             root=root.next;
        }
        return data;
    }

    /**
     * Return the top value from the stack
     * @return int value
     */
    public int peek()
    {
        return root==null?0:root.data;
    }

	//Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();
        System.out.println(sll.pop() + " popped from stack");

        sll.push(10);
        System.out.println("Top element is " + sll.peek());

        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
