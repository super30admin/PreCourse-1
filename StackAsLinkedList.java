public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;
        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        if (root == null) {
            // System.out.println("Stack is empty");
            return true;
        } else
            return false;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to the stack");
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is empty");
        }
        // Write code to pop the topmost element of stack.
        else {
            popped = root.data;
            root = root.next;
            // System.out.println(popped +"is popped from the stack");
        }

        // Also return the popped element
        return popped;
    }

    public int peek() {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        // Write code to just return the topmost element without removing it.
        else {
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
