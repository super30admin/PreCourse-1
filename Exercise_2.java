//Time complexity: O(1)
//Space Complexity O(n) where n is size of the stack
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

        if (newNode == null) {
            System.out.println("\nStack Overflow");
            return;
        }
        newNode.next = root;

        root = newNode;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (root == null) {
            System.out.println("\nStack Underflow");
            return 0;
        }
        StackNode temp = root;
        root = root.next;

//        temp = null;

        return temp.data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()) {
            return root.data;
        }
        System.out.println("\n Stack is empty");
        return Integer.MIN_VALUE;
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
