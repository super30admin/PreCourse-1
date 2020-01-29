public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        return root == null; // stack is empty is root is null
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode newNode = new StackNode(data); // Creating new Stack Node to insert into Stack

        // If Stack is empty set new Node as root and return
        if (isEmpty()) {
            this.root = newNode;
            return;
        } else { // Insert the new node before the root node and make the new node as root
            newNode.next = this.root;
            this.root = newNode;
        }
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // Write code to pop the topmost element of stack.
        int popped = root.data;
        root = root.next;
        // Also return the popped element
        return popped;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (isEmpty()) // if empty returning 0
            return 0;
        return root.data; // if not empty returning root element
    }

    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
