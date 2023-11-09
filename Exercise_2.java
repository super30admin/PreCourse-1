class StackAsLinkedList {

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
        return (this.root == null);
    }

    public void push(int data) {
        StackNode sn = new StackNode(data);
        if (root == null) {
            this.root = sn;
            return;
        }
        StackNode tmp = root;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = sn;
        // Write code to push data to the stack.
    }

    public int pop() {

        // If Stack Empty Return 0 and print "Stack Underflow"
        if (root == null) {
            return 0;
        }

        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (root.next == null) {
            int val = root.data;
            root = null;
            return val;
        }
        StackNode tmp = root;
        StackNode prev = root;
        while (tmp.next != null) {
            prev = tmp;
            tmp = tmp.next;
        }
        int val = tmp.data;
        prev.next = null;
        return val;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (root == null) {
            return 0;
        }

        StackNode tmp = root;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
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
