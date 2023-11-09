// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : do not know how to identify
// Any problem you faced while coding this : No

class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int _data) {
            // Constructor here
            data = _data;
            next = null;
        }
    }
    
    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        if (root == null) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode last = new StackNode(data);
        if (!isEmpty()) {
            last.next = root;
        }
        root = last;

    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode popedVariable = root;
        root = root.next;
        return popedVariable.data;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        return root.data;
    }
}
class Main { 
    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(40);
        sll.push(50);
        sll.push(60);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
