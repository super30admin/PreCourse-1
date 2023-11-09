// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this : None

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

    public boolean isEmpty() { // O(1)
        // Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data) { // O(1)
        // Write code to push data to the stack.
        StackNode item = new StackNode(data);
        item.next = root;
        root = item;
    }

    public int pop() { // O(1)
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (root == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = root.data;
        root = root.next;
        return val;
    }

    public int peek() { // O(1)
        // Write code to just return the topmost element without removing it.
        if (root != null) {
            return root.data;
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
