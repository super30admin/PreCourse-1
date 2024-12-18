/**
 * Time Complexity
 * Push: 0(1)
 * Pop: O(1)
 * Peek: 0(1)
 * isEmpty: 0(1)
 *
 * Space Complexity: 0(n)
 *
 */

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
        return root == null;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode newTop = new StackNode(data);
        newTop.next = root;
        root = newTop;
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int topElement = root.data;
        StackNode temp = root;
        root = root.next;
        temp = null;
        return topElement;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            return -1;
        }
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
