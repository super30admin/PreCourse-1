
// Time Complexity : isEmpty - O(1), push - O(1), pop - O(1), peek - O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :I have to put a more effort for this one because i am not i a habit of working with linked lists to first i have to figure out the linked list part firt, after that it was a bit easy as i had already implement stack for the previous exericise.
public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            next = null;

        }
    }

    public boolean isEmpty() {
        return root == null;
        // Write your code here for the condition if stack is empty.
    }

    public void push(int data) {
        // Null check added
        StackNode temp = new StackNode(data);
        if (isEmpty()) {
            root = temp;

        } else {
            temp.next = root;
            root = temp;
        }
        // Write code to push data to the stack.
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int num;
            num = root.data;
            root = root.next;
            return num;
        }
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int num;
            num = root.data;
            return num;
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
