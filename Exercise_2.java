// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

public class StackAsLinkedList {

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
        return root == null;

    }

    public void push(int data)
    {
        //pushed as first element of the linked list

        //Write code to push data to the stack.
        StackNode sn = new StackNode(data);
        sn.next = root;
        root = sn;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element

        // first element of the list will be top most element of stack
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int data = root.data;
            root = root.next;
            return data;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.

        // first element of the list will be top most element of stack

        if(root == null) {
            System.out.println("Stack Underflow");
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

        System.out.println(sll.isEmpty());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.isEmpty());


        //System.out.println("Top element is " + sll.peek());
    }
}