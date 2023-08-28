public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            // Constructor here
        }
    }

    public boolean isEmpty() {
        if (root == null)
            return true;
        else
            return false;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = root; // Set the new node's next to the current root
        root = newNode; // Update root to the new node
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = root.data;
            root = root.next;
            return x;
        }
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return 0;
        } else
            return root.data;// accessing the top indexed value from array and returning it
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

// Time Complexity : O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach