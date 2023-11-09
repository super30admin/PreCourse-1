public class StackAsLinkedList {

    StackNode root;
    StackNode tail;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int d) {
            // Constructor here
            data = d;
            next = null;
        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        if (root == null) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if (isEmpty()) {
            root = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            StackNode temp = new StackNode(-1);
            temp.next = root;
            StackNode node = temp;
            while (node.next.next != null) {
                node = node.next;
            }
            int popElement = node.next.data;
            node.next = null;
            tail = node;
            return popElement;
        }
        // Write code to pop the topmost element of stack.
        // Also return the popped element
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (tail != null) {
            System.out.println(tail.data);
            return tail.data;
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
