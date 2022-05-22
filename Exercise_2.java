/*
Time complexity:
Space Complexity:
Did this code successfully run on Leetcode:
Any problem you faced while coding this:

Code along with comments explaining my approach is as follows
*/

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
        StackNode new_node = new StackNode(data);
        if (isEmpty()) {

            root = new_node;
            new_node.next = null;
        } else {

            new_node.next = root;
            root = new_node;
        }
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int n = root.data;
            System.out.println("popping " + n);
            if (root.next == null)
                root = null;
            else
                root = root.next;
            return n;
        }

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

        // System.out.println("Top element is " + sll.peek());

        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");

    }
}