public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;
            this.next = next;
        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        return root == null;

    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode prev = root;
        root = new StackNode(data);
        root.next = prev;
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (isEmpty()) {
            System.out.println("under overflow");
            System.exit(1);
        }
        int element = root.data;
        root = root.next;
        return element;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (!isEmpty()) {
            return root.data;
        } else {
            System.exit(1);
        }
        return -1;
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
