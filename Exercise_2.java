// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
        if(root == null)
        {
            return true;
        }

        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        if(root == null)
        {
            root = new StackNode(data);
        }
        else
        {
            StackNode temp = new StackNode(data);
            temp.next = root;
            root = temp;
        }
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element

        if(root == null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int element = root.data;
            root = root.next;
            return element;
        }

    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(root == null)
        {
            return -1;
        }
        else
        {
            return root.data;
        }
    }

    //Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");
        sll.push(20);
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");
        sll.push(30);
        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}