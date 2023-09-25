// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

public class StackAsLinkedList {

    /**
     * Denotes top of the stack
     */
    private StackNode root;

    private static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;
        }
    }

    public StackAsLinkedList() {
    }

    /**
     * TC: O(1) <br>
     * SC: O(1)
     * 
     * @return true == empty, else false
     */
    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        /**
         * If root == null => stack is empty
         */
        return root == null;
    }

    /**
     * TC: O(1) <br>
     * SC: O(1)
     */
    public void push(int data) {
        // Write code to push data to the stack.
        /**
         * Create a new node.
         * node.next = root
         * Assign root = new_node, such that root denotes the top element
         */
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    }

    /**
     * TC: O(1) <br>
     * SC: O(1)
     * 
     * @return
     */
    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        /**
         * If stack is empty => nothing can be popped => return 0
         */
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode pop = root;
        root = pop.next;
        return pop.data;
    }

    /**
     * TC: O(1) <br>
     * SC: O(1)
     * 
     * @return
     */
    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            return 0;
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
