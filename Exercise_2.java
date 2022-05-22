// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode:
// Any problem you faced while coding this: Yes, for implementation purpose took ref from the internet

class StackAsLinkedList {

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
        StackNode nNode = new StackNode(data);
        nNode.next = null;
        // Write code to push data to the stack.
        if (isEmpty()) {
            root = nNode;
        } else {
            StackNode temp = root;
            // Looping through root to top and adding aliment at top
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nNode;
        }
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            StackNode temp = root;

            // If stack is having only one element
            if (temp.next == null) {
                root = null;
                return temp.data;
            }

            // Looping through root to top 
            while (temp.next.next != null) {
                temp = temp.next;
            }
            // Write code to pop the topmost element of stack.
            // Also return the popped element
            int res = temp.next.data;
            temp.next = null;
            return res;
        }
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.

        // Check if stacklink list is empty or no
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            // returning top element in stackedLinkedlist
            StackNode temp = root;

            while (temp.next != null) {
                temp = temp.next;
            }

            return temp.data;
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
