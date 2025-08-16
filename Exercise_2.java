// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// Pushing to stack on top as list
class StackAsLinkedList {

    StackNode head;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data, StackNode next) {
            this.data = data;
            this.next = next;
        }

    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        return this.head == null;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode node = new StackNode(data, head);
        head = node;
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        }

        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Empty stack");
            return 0;
        }

        return head.data;
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
