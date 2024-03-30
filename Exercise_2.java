public class StackAsLinkedList {
    // Time complexity of push(), pop(), peek() are big O(1).
    // Space complexity is also O(1).
    StackNode top;

    public StackAsLinkedList() {
        this.top = null;
    }

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        if (top == null)
            return true;

        return false;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;// setting new node as top
    }

    public int pop() {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return 0;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public int peek() {
        return top.data;
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
