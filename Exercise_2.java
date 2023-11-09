// Time = O(1)
// Space = O(n)
class StackAsLinkedList {

    private StackNode root;
    private StackNode top;

    static class StackNode {
        private int data;
        private StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        if (top == null) {
            root = new StackNode(data);
            top = root;
        } else {
            StackNode temp = new StackNode(data);
            temp.next = top;
            top = temp;
        }
    }

    public int pop() {
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int data = top.data;
            top = top.next;
            if (top == null) {
                root = null;
            }
            return data;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack Underflow");
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
        System.out.println(sll.pop() + " popped from stack");

        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");

    }
}
