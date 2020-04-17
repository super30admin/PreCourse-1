/**
 * Create a stack data structure using linkedlist
 */
class StackAsLinkedList {
    //this acts as a top
    ListNode root;

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data)
        {
           this.data=data;
           next=null;
        }
    }

    /**
     * Method to check whether stack is empty or not
     * @return true when stack is empty else returns false
     */
     //Time Complexity:o(1) because We just check whether root is null or not
     // Space complexity:o(1):
    public boolean isEmpty()
    {
        return root==null;
    }

    /**
     * Push the data into stack
     * @param data
     */
    //Time Complexity:o(1) because we have just created one node here and added at top
    // Space complexity:o(1):
    public void push(int data)
    {
        //Write code to push data to the stack.
        ListNode node=new ListNode(data);
        if (root != null) {
            node.next = root;
        }
        root=node;

    }

    /**
     * pop/remove the top element from the stack
     * @return popped element
     */
    //Time Complexity:o(1) because We just remove and return top value
    // Space complexity:o(1):
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
    //Time Complexity:o(1) because We just return top value
    // Space complexity:o(1):
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
