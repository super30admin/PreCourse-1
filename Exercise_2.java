public class StackAsLinkedList {
// Time Complexity : Push: O(1), Pop(1), Peek O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this : No

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
        if(root == null)
            return true;
        else
            return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;

    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode node = root;
        root = root.next;
        return node.data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(root != null)
            return root.data;
        else
            return -1;
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
