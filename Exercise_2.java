class StackAsLinkedList {

    // Time complexity: O(1)
    // Space complexity: O(n)

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
        return root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode temp = new StackNode(data);
        if(temp == null)
            return;
        temp.next = root;
        root = temp;
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int ele = root.data;
        root = root.next;
        return ele;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()) {
            return root.data;
        }
        return -1;
    }

	//Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(60);
        sll.push(40);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
