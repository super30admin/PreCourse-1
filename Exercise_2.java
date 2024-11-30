// Time Complexity : O(1)
// Space Complexity : O(1)
class StackAsLinkedList {

    StackNode top;

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
        return top == null;

    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);

        //If stack is empty, then make new node as the root, else add new node at the start
        if(isEmpty()) {
            top = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;
        }

    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(isEmpty())
            return 0;

        //pop the element at the root
        StackNode poppedNode = top;

        //Update root to point to root.next
        top = top.next;

        return poppedNode.data;

    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        return top.data;
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
