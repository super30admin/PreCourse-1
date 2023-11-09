// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : couldn’t find this question on leetcode
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
public class StackAsLinkedList {

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data=data;
            this.next=null;
        }
    }
    StackNode root;

    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        // if root node is null then list is empty and hence true is returned otherwise false
        if(root==null)
            return true;
        else
            return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.

        // if root is null then list is empty so create new node and point root to it else traverse the list and append new node at end of list
        if(root==null){
            root=new StackNode(data);
            return;
        }
        else{
            StackNode curr=root;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=new StackNode(data);
        }
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element

        // if list is empty no element will be returned
        if(root==null)
        {
            System.out.println(“Stack Underflow”);
            return 0;
        }
        else
        {
            // We maintain two pointers curr and prev, make curr as next to root and prev as root

            StackNode curr=root.next;
            StackNode prev=root;
            // if curr is null return only element and make list empty
            if(curr==null)
            {
                root=null;
                return prev.data;
            }

            // otherwise traverse the end of list and also maintain prev of the element and at end make prev point to null and return curr
            else {
                while (curr.next != null) {
                    prev = prev.next;
                    curr = curr.next;
                }
                prev.next = null;
            }
            return curr.data;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        // traverse the list and return last element
        if(root=null)
            return 0;
        else{
            StackNode curr=root;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            return curr.data;
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
