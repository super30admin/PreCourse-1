
class StackAsLinkedList {

    StackNode root;
    StackNode curr;

    static class StackNode {
        int data;
        StackNode next;
        StackNode prev;

        StackNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }

    }

    // Time and space complexity => O(1)
    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }

    }

    // Time complexity => O(n)
    // space complexity => O(1) -> cause we are not using extra space
    public void push(int data) {
        // Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
            return;

        } else {
            curr = root;

            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.prev = curr;

        }

    }

    // Time complexity => O(n)
    // space complexity => O(1) -> cause we are not using extra space

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element

        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            curr = root;
            while (curr.next != null) {
                curr = curr.next;
            }
            if (curr.prev != null) {
                curr.prev.next = null;
            } else {
                root = null;

            }

            return curr.data;
        }

    }

    // Time complexity => O(n)
    // space complexity => O(1) -> cause we are not using extra space
    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (root == null) {
            return 0;
        } else {
            curr = root;

            while (curr.next != null) {
                curr = curr.next;
            }

            return curr.data;
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
