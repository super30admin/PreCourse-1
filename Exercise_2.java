/**
 * notes:
 * Why linkedList: size of the stack is not known in advance
 * malloc
 */
class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            next = null;
        }
    }

    StackAsLinkedList() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // Write code to pop the topmost element of stack.
        StackNode top = root;
        root = root.next;
        // Also return the popped element
        return top.data;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        return root.data;
    }

    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
        sll.push(10);
        sll.push(20);
        sll.push(30);
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
    }
}
