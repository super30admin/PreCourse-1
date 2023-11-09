// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
class StackAsLinkedList {

    StackNode root;
    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root ==null;
    }

    public void push(int data)
    {
        StackNode node = new StackNode(data);

        if(node==null)
        {
            System.out.println("Stack overflow");
        }
        node.next = root;
        root = node;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (isEmpty())
        {
            System.out.println("Stack underflow");
            return 0;
        }

        int top = peek();
        this.root = (this.root).next;
        return top;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        {
            System.out.println("Stack Empty");
            return 0;
        }
        return root.data;
    }
}

public class Exercise_2
{
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
