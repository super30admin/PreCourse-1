// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
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
        return (root == null);
    }

    public void push(int data) {
        // Write code to push data to the stack.
        if (root == null) {
            root = new StackNode(data);
        } else {
            StackNode next_node = new StackNode(data);
            next_node.next = root;
            root = next_node;
        }
    }

    public int pop() {

        if (root == null) { // If Stack Empty Return 0 and print "Stack Underflow"
            System.out.println("Stack Underflow");
            return -1;
        }
        int top = root.data; // pop the topmost element of stack.
        StackNode node = root.next;
        root.next = null;
        root = node;
        return top; // return the popped element
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (root == null) {
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
