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
        if (root == null)
            return true;
        else
            return false;
    }

    public void push(int data) {
        StackNode node = new StackNode(data);
        if (root == null)
            root = node;
        else {
            node.next = root;
            root = node;
        }
    }

    public int pop() {
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode top = root;
        root = root.next;
        return top.data;

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return root.data;
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
