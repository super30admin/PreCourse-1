/*
Time: Push O(1), Pop O(1), Peek O(1)
Space: O(2*n) - Number of elements pushed into stack and their next pointers
Did this code successfully run on Leetcode : N/A
Any problem you faced while coding this : None
*/
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
        return root == null;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode curr = new StackNode(data);

        if (root == null) {
            root = curr;
            return;
        }

        curr.next = root;
        root = curr;
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        int result = root.data;
        root = root.next;
        return result;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (root == null) {
            System.out.println("Stack Underflow");
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
