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


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root == null; // Checking whether root is null which indicates whether stack is empty
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data); // Creating a new node with given data

        // Now, the node has to be pushed onto the stack.
        // We use the isEmpty function created above
        if(isEmpty())
        {
            root = newNode; // If the stack is empty, set the root to the new node
        }

        else
        {
            newNode.next = root; // Set the next of the newNode to root
            root = newNode; // Update the root to be the newNode, making it the top of the stack
        }

    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
    }

    public int peek()
    {
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
