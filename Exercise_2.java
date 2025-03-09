//  Time complexity: O(1) all stack operations
//  Space complexity: O(n) where n is the number of StackNodes in the linked list
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
        //Write your code here for the condition if stack is empty
        return (root == null);
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        // add new node at the front for the list
        if (!isEmpty()) {
            newNode.next = root; //link the new node with the root node
        }
        root  = newNode;


    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        int poppedData = root.data;
        root = root.next; //move root to next node in the list
        return poppedData; //return the popped element
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack Empty");
            return 0;
        }
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
