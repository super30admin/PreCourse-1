/*
Time Complexity:
isEmpty(): O(1)
push(): O(1)
pop(): O(1)
peek(): O(1)
 */

/*
Space Complexity:
isEmpty(): O(1)
push: O(n) - n represents push operation for all the elements
pop(): O(1)
peek(): O(1)
 */

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
        return root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode stackNode = new StackNode(data);
        stackNode.next = root;
        root = stackNode;

    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int poppedValue = root.data;
        root = root.next;
        return poppedValue;

    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            System.out.println("Stack is Empty");
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
