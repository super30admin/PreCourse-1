// Time Complexity : O(N)
// Space Complexity : O(1)
// Any problem you faced while coding this : I had to rename the file as StackAsLinkedList else it was throwing complie error

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
        // Write your code here for the condition if stack is empty.
        if (root == null) {
            System.out.println("Stack Underflow");
        }
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode node = new StackNode(data);

        if (root == null) {
            root = node;
        } else {
            StackNode abc = root;
            root = node;
            node.next = abc;
        }

    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        int pop = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            pop = root.data;
            root = root.next;
        }
        return pop;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (root == null) {
            System.out.println("Stack Underflow");

        } else {
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