public class StackAsLinkedList {

    StackNode root;
    StackNode leaf;
    StackNode previousNode;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        if (this.root == null)
            return true;
        else
            return false;
    }

    public void push(int data) {
        StackNode objSN = new StackNode(data);
        if (this.root == null) {
            root = objSN;
        }
        leaf = objSN;
        leaf.next = previousNode;
        previousNode = objSN;
    }

    public int pop() {
        if (leaf == null)
            return 0;
        else {
            int currentValue = leaf.data;
            leaf = leaf.next;
            return currentValue;
        }
    }

    public int peek() {
        if (leaf == null)
            return 0;
        else
            return leaf.data;
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