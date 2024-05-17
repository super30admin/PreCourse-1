// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Exercise_2 {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        if (root == null) {
            return true; // Empty
        }
        return false;
    }

    public void push(int data) {
        // Will not check for overflow
        // Check for if there is a stack created
        if (root == null) {
            // if not createdm then start by creating a node.
            root = new StackNode(data);
        } else {
            StackNode next_node = new StackNode(data);
            next_node.next = root;
            root = next_node;
        }
    }

    public int pop() {
        if (root == null) {
            System.out.println("Stack Underflow Occured");
            return -1;
        }
        int top = root.data;
        StackNode node = root.next;
        root.next = null;
        root = node;
        return top;
    }

    public int peek() {
        if (root == null) {
            return -1;
        }
        return root.data;
    }

    // Driver code
    public static void main(String[] args) {

        Exercise_2 sll = new Exercise_2();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
