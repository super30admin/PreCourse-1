// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this : Minor error in push(), but resolved
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

    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        StackNode node = new StackNode(data);
        if (root != null){
            StackNode temp = new StackNode(root.data);
            root = node;
            root.next = temp;
        } else {
            root = node;
        }
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null){
            System.out.println("Stack Underflow!");
            return 0;
        }
        // Write code to pop the topmost element of stack.
        StackNode res = root;
        root = root.next;
        // Also return the popped element
        return res.data;
    }

    public int peek() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null){
            System.out.println("Stack Underflow! Stack empty");
            return 0;
        }
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

        System.out.println("Top element is " + sll.peek());
    }
}
