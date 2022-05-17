// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : Yes.
// I have stucked with the push function. But I have take some refrences from google and solved it.

class StackAsLinkedList {

    // root node of the list
    public static StackNode root;

    public static class StackNode {
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
        // if root node is null that means stack is empty
        if (root == null) {
            return true;
        }
        return false;

    }

    public void push(int data) {
        // Write code to push data to the stack.

        // create a newNode with given data
        StackNode newNode = new StackNode(data);
        newNode.next = null;

        // check if stack is empty then make a newNode as root
        if (isEmpty()) {
            root = newNode;
        } else {
            StackNode dummy = root;
            // else traverse till last node and insert newNode at last
            while (dummy.next != null) {
                dummy = dummy.next;
            }
            dummy.next = newNode;
        }

    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element

        // check stack is empty than print stack underflow
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {

            // else travels till second last element return last node data and make change
            // next of second last node
            StackNode dummy = root;
            if (dummy.next == null) {
                root = null;
                return dummy.data;
            }
            while (dummy.next.next != null) {
                dummy = dummy.next;
            }
            int result = dummy.next.data;
            dummy.next = null;
            return result;
        }

    }

    public int peek() {

        // Write code to just return the topmost element without removing it.
        // check stack is empty than print stack underflow
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            // else travels till second last element return last node data
            StackNode dummy = root;
            while (dummy.next != null) {
                dummy = dummy.next;
            }
            return dummy.data;
        }

    }

}

class Main {
    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(40);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
        System.out.println("Top element is " + sll.peek());

    }
}
