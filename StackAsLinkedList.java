public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;

        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        return root == null;

    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode new_Node = new StackNode(data);
        if (root == null) {
            root = new_Node;
        }
        new_Node.next = root;
        root = new_Node;
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // Write code to pop the topmost element of stack.
        int pop_Node = root.data;
        root = root.next;

        // Also return the popped element
        return pop_Node;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        return root.data;
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
