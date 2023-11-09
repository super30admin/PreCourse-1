// Time Complexity : push and pop : O(1)
// Space Complexity : O(N) where N is the size of the stack
// Did this code successfully run on Leetcode : Ran it locally on IDE and works
// Any problem you faced while coding this : No

public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        /* node initialized
        */
        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }

    /*
      if root points to null, it is empty
    */
    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return this.root == null;
    }

    /*
      checking if root is not null then creating a new node and making it head
      by assigning the current head to the next pointer of new node
      O(1) operation
    */
    public void push(int data)
    {
        //Write code to push data to the stack.
        if(this.root != null){
          StackNode newNode = new StackNode(data);
          newNode.next = root;
          root = newNode;
        }
        else{
          this.root = new StackNode(data);
        }
    }
    /*
      if not empty, remove the head element and make the node it's next
      points to as the new head, if there is only one element
      root points to null
      O(1) operation again as it involves only modifying the pointers
    */
    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element

        if(this.isEmpty()){
          System.out.println("Stack underflow");
          return 0;
        }

        StackNode popped = this.root;
        this.root = popped.next;
        popped.next = null;

        return popped.data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()) return this.root.data;

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
