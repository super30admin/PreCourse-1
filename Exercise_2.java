public class StackAsLinkedList {

    // Time Complexity: O(1) for all operations
    // Space Complexity: O(n), where n is the number of nodes in the stack
    StackNode root;

    // Node class
    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Push a new element onto the stack
    public void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = root; // new node points to current top
        root = newNode;      // new node becomes the new top
        System.out.println(data + " pushed to stack");
    }

    // Pop the top element and return it
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int popped = root.data;
            root = root.next; // move root to the next node
            return popped;
        }
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return root.data;
        }
    }

    // Driver code to test the stack
    public static void main(String[] args) {
        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
    }
}
