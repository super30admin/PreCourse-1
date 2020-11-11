// Time Complexity :O(1)
// Space Complexity :O(n) where n is the maximum size of the stack
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


public class StackAsLinkedList {

    StackNode root=null;


    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data=data;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if(root== null)
            return true;
        else
            return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next=root;
        root= newNode;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(root==null){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int value = root.data;
            root= root.next;
            return value;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(root== null)
            return 0;
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