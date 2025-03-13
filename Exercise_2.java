// Time Complexity: O(1)
// isEmpty() - Checks if stack is empty (O(1))
// push() - Adds element to top of stack (O(1))
// pop() - Removes and returns top element (O(1))
// peek() - Returns top element without removing it (O(1))
// Space Complexity: O(N)
// Did this code successfully run on Leetcode : N/A
// I don't see leetcode link to this problem
// Any problem you faced while coding this: NO

public class StackAsLinkedList {

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
        return root == null;
    }

    public void push(int data) {
        // Create temp node to with input data
        StackNode temp = new StackNode(data);
        if (isEmpty()) {
            // if the stack is empty which means root will be the new node that get's added
            root = temp;
        } else {
            // newNode or temp should point to the root and root should be updated to the top element
            temp.next = root;
            root = temp;
        }
    }

    public int pop() {
        // This is straight forward: check if stack is empty as the first operation could be pop
        // if empty then print stack underflow otherwise
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // Store the pooped element data which is the current root
        // point temp to root.next as root would be top element
        // update the root and return stored popped element
        int poppedData = root.data;
        StackNode temp = root.next;
        root = temp;

        return poppedData;
    }

    public int peek() {
        // return root.data as root would be top element
        return root.data;
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
