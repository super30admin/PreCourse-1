public class StackAsLinkedList {
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : yes
    // Any problem you faced while coding this : no

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
        StackNode node = new StackNode(data);
        node.next = null;
        if (isEmpty()) {
            root = node;
        } else {
            StackNode currNode = root;

            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = node;
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
            StackNode currNode = root;
            while (currNode.next.next != null) {
                currNode = currNode.next;
            }
            int data = currNode.next.data;
            currNode.next = null;
            return data;

        }
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        StackNode currNode = root;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        return currNode.data;
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
