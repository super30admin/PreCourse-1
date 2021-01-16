class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;
            next = null;
        }
    }

    // O(1)
    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        return root.equals(null);
    }

    // O(n)
    public void push(int data) {
        // Write code to push data to the stack.
        StackNode top = root;
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        } else {
            while (top.next != null) {
                top = top.next;
            }

            top.next = newNode;
        }
    }

    // O(n)
    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element

        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            StackNode prev = root;
            StackNode top = root;
            while (top.next != null) {
                prev = top;
                top = top.next;
            }
            prev.next = null;
            return top.data;
        }

    }

    // O(n)
    public int peek() {
        // Write code to just return the topmost element without removing it.

        if (root == null) {
            System.out.println("Stack Empty");
            return 0;
        } else {
            StackNode top = root;
            while (top.next != null) {
                top = top.next;
            }
            return top.data;
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
