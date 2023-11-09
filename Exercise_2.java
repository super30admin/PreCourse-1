class StackAsLinkedList {


    // Time Complexity:
    // isEmpty() - O(1)
    // push() - O(1)
    // pop() - O(1)
    // peek() - O(1)
    // Space Complexity for these - O(n)


    private StackNode top;

    static class StackNode {
        private int data;
        private StackNode prev;

        StackNode(int data)
        {
            //Constructor here
            this.data  = data;
            this.prev = null;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if (top == null) {
            return  true;
        }

        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if (top != null) {
            newNode.prev = top;
        }
        top = newNode;
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element

        if (this.isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

       int popData = top.data;
        top = top.prev;

        return popData;

    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.

        if (this.isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        return top.data;
    }

	//Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList s = new StackAsLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop() + " Popped from stack");
        System.out.println((s.peek() + "is Stack's peek"));
        System.out.println("Is Stack's empty: " + s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Is Stack's empty: " + s.isEmpty());

        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Is Stack's empty: " + s.isEmpty());
    }
}
