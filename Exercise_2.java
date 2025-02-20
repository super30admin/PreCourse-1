// Time Complexity : Push, Pop, Peek and isEmpty are all O(1) as we did not need to iterate through the SLL
// Space Complexity : O(n) where n is size of SLL
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : None
// Code here along with comments explaining your approach
class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;
        /*
            Sets data to passed data and next pointer to null
         */
        StackNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    /*
        @param: None
        @return Returns true if root node is null else false
     */
    public boolean isEmpty()
    {
        return root == null;
    }
    /*
        Creates a new node. Assign the new node's next as root and root as the new node
        @param: data of the new node to be added
        @return None
    */
    public void push(int data)
    {
       StackNode node = new StackNode(data);
       node.next = root;
       root = node;
    }

    /*
        If isempty returns 0 or else stores the root's data in a variable.
        Assigns root to root.next in a manner to delete initial root.
        @param: None
        @return 0 if empty or initial root's val
    */
    public int pop()
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return  0;
        } else {
            int poppedItem = root.data;
            root = root.next;
            return poppedItem;
        }
    }

    /*
        If isempty returns 0 or else root.data which is basically top.
        @param: None
        @return 0 if empty or root's val
    */

    public int peek()
    {
        if(isEmpty()){
            return 0;
        } else {
            return root.data;
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
        System.out.println("Stack is empty " + sll.isEmpty());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
        System.out.println("Stack is empty " + sll.isEmpty());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
        System.out.println("Stack is empty " + sll.isEmpty());
    }
}
