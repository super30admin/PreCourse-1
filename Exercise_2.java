class StackAsLinkedList {

    // Time Complexity : O(1)
    // Space Complexity :

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
            return true;
        }
        return false;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode newN = new StackNode(data);
        boolean emp = isEmpty();
        if (emp) {
            root = newN;
        } else {
            StackNode temp = root;
            root = newN;
            newN.next = temp;
            System.out.println(newN.data + " pushed into stack");
        }

    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        boolean emp = isEmpty();
        int x = 0;
        if (emp) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            x = root.data;
            root = root.next;
            return x;
        }
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        boolean emp = isEmpty();
        int x = 0;
        if (emp) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            x = root.data;
            return x;
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
