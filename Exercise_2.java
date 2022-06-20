// Time Complexity : O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data,StackNode root) {
            // Constructor here
            this.data = data;
            this.next = root;
        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        return (root == null);
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode tempNode = new StackNode(data,root);
        root = tempNode;
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int pop= root.data;
            root = root.next;
            
            return pop;
        }
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            return 0;
        } else {
            return root.data;
        }
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
