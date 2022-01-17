//Push, Pop, Peek
// Time Complexity : O(1)
// Space Complexity : O(1)
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
        if (root == null)
            return true;
        else
            return false;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode tempNode = new StackNode(data);
        tempNode.next = root;
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
            int data = root.data;
            root = root.next;
            return data;
        }
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (isEmpty())
            return 0;
        else
            return root.data;
    }

    public void display() {
        StackNode current = root;

        while (current != null) {
            System.out.println(current.data + "");

            current = current.next;
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
        sll.display();
    }
}
