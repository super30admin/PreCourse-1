
public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;
            next = null;
        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode traverse = root;
        if (root == null)
            root = new StackNode(data);
        else {
            while (traverse.next != null) {
                traverse = traverse.next;
            }
            traverse.next = new StackNode(data);
        }
    }

    public int pop() {
        int element = 0;
        StackNode traverse = root, previous = root;
        // If Stack Empty Return 0 and print "Stack Underflow"
        if (root == null)
            System.out.println("Stack underflow");
        // Write code to pop the topmost element of stack.
        else {
            while (traverse.next != null) {
                previous = traverse;
                traverse = traverse.next;
            }
            element = traverse.data;
            previous.next = null;
        }
        // Also return the popped element
        return element;
    }

    public int peek() {
        StackNode traverse = root;
        // Write code to just return the topmost element without removing it.
        while (traverse.next != null) {
            traverse = traverse.next;
        }
        return traverse.data;
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
