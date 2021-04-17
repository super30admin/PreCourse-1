public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data = data;
        }
    }
    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else
            return false;
    }

    public void push(int data)
    {
        StackNode nodeToPush = new StackNode(data);
        if(root == null) {
            root = nodeToPush;
        } else {
            // Pushing the new node at the start of the LinkedList
            StackNode tempNode = root;
            root = nodeToPush;
            nodeToPush.next = tempNode;
        }
        System.out.println("Node with data "+ data +" pushed to stack");
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        int poppedElement = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is Empty");
        } else {
            poppedElement = root.data;
            root = root.next;
        }
        return poppedElement;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else
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
