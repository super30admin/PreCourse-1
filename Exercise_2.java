// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this :  N

public class StackAsLinkedList {

    StackNode root;
    StackNode top;

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
        if (root == null)
            return true;

        return false;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if (isEmpty()) {
            root = node;
        } else {
            StackNode current = root;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // Write code to pop the topmost element of stack.
        StackNode current = root;
        StackNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        int poppedElement = current.data;
        previous.next = null;
        // Also return the popped element
        return poppedElement;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode current = root;
       
        while (current.next != null) {
            current = current.next;
        }
        int topElement = current.data;

        return topElement;

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
