// Time Complexity:
// push, pop, peek, isEmpty -> O(1)

// Space Complexity
// O(n) -> stack size 

public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;
            this.next = null;
        }
    }

    StackAsLinkedList() {
        this.root = null;
    }

    public boolean isEmpty() {
        // if root == null ? empty
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        // create new node and assign it as root
        StackNode newNode = new StackNode(data);

        if (newNode == null) {
            System.out.println("Stack overflow");
            return;
        }
        newNode.next = root;
        root = newNode;

    }

    public int pop() {
        // check if stack isEmpty ? return 0 : assign root to temp and update root to
        // next node
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        }
        StackNode temp = root;
        root = root.next;
        int data = temp.data;
        temp = null;

        return data;
    }

    public int peek() {
        // check isEmpty ? "empty" : return root data
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
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
