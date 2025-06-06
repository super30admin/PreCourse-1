/* Time complexity : isEmpty() operation - O(1)
                     push() operation - O(1)
                     pop() operation - O(1)
                     peek() operation - O(1)

    Space Complexity : O(n), n = no of elements in stack
*/

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
        return root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
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

        int popped = peek();
        root = root.next;

        return popped;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
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
