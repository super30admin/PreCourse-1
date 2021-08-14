// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        } // Initialize stack
    }


    public boolean isEmpty() {
        // Check for empty stack by checking for the root node
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        // Initialize a new StackNode element
        StackNode n = new StackNode(data);
        // Insert new element as root node and assign reference to previous element if it exists
        if (isEmpty()) {
            root = n;
        } else {
            StackNode x = root;
            root = n;
            root.next = x;
        }
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            // De-assign the reference to the element being popped
            int popped = root.data;
            root = root.next;
            return popped;
        }
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return root.data;
        }
    }

    //Driver code
    public static void main(String[] args) {
        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
