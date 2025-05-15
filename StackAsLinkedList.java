// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


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
            this.next = null;

        }
    }
    StackAsLinkedList()
    {
        this.root = null;
    }

    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return (root == null);
    }

    public void push(int data)
    {
        StackNode newNode = new StackNode(data);
        //Write code to push data to the stack.
       newNode.next = root;
       root = newNode;
    }

    public int pop()
    {
        if(isEmpty())
        {
            return 0;
        }
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        else{
            int poppedData = root.data;
            root = root.next;
            return poppedData;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        {
            return 0;
        }
        else{
            return (root.data);
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
