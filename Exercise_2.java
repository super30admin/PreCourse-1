//Push O(1), Pop - O(1), Peek O(1), Space complexity - O(n)
class StackAsLinkedList {

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
        return root==null;
    }

    public void push(int data) {
        StackNode n = new StackNode(data);
        if (root == null) {
            root = n;
        } else {
            n.next = root;
            root = n;

        }

    }

    public int pop() {
        if (root == null) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            StackNode s = root;
            root = root.next;
            return s.data;
        }
    }

    public int peek() {
        if (root == null) {
            System.out.println("Stack underflow");
            return 0;
        } else {
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
