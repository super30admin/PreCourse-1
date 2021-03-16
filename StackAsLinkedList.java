
// Time Complexity : O(1)
// Space Complexity : O(N) where N is the number of elements in the Stack
// Did this code successfully run on Leetcode : Not there on leetcode
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach
public class StackAsLinkedList {

    StackNode root = null;
    // Inititalze the StackNode
    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data = data;
            this.next = null;
            //Constructor here
        }
    }

    // If root pointer is null it means the there is no data hence return true else return false
    public boolean isEmpty()
    {
        if(root == null){
            return true;
        }
        return false;
        //Write your code here for the condition if stack is empty.
    }

    // Create a new node with the given value and then make this new Node point to the root. After this make the new node as the new root
    public void push(int data)
    {
        StackNode currNode = new StackNode(data);
        currNode.next = this.root;
        this.root = currNode;

        //Write code to push data to the stack.
    }
    //If isEmpty() is true, it means nothing to pop else store root in a temporary popNode and make root point to root.next and return the popNode
    public int pop()
    {
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode popNode = this.root;
        this.root = this.root.next;
        return popNode.data;
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
    }
    //If isEmpty() is true, it means there is nothing to peek. return 0 else return root.data
    public int peek()
    {
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }

        return this.root.data;
        //Write code to just return the topmost element without removing it.
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


