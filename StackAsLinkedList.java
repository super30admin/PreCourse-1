// Time Complexity : All the operations (isEmpty(), push(), pop() and peek()) take O(1) time as it is performed on the top element
// Space Complexity : O(n) considering n elements
// Any problem you faced while coding this : No
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
            // Pushing the new node at the start of the LinkedList by using tempNode
            StackNode tempNode = root;
            root = nodeToPush;
            nodeToPush.next = tempNode;
        }
        System.out.println("Node with data "+ data +" pushed to stack");
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Popping the topmost element of stack if stack is not empty
        // Returned the popped element
        int poppedElement = 0;
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
        // Return the topmost element without removing it if the stack is not empty
        if(root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else {
            return root.data;
        }
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
