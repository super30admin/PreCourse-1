public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;

        }
    }

    public boolean isEmpty() {
        return (root == null);
    }

    public void push(int data) {
        StackNode node = new StackNode(data);

        if (isEmpty()) {
            root = node;
        } else {

            node.next = root;
            root = node;
        }

    }

    public int pop() {

        if (!isEmpty()) {
            int val = root.data;
            System.out.println(" newroot" + root.next.data);
            root = root.next;

            return val;
        } else {
            System.out.println("Stack Underflow");
            return 0;
        }
    }

    public int peek() {

        if (!isEmpty()) {
            return root.data;
        } else {
            System.out.print("Empty Stack");
            return 0;
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
