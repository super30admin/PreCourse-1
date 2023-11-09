// Time Complexity :      Push operation O(1), Pop operation O(1)
// Space Complexity :                                        O(1) // No Additional Space Apart from initial Max Value
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :            NO
class StackAsLinkedList {

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    StackNode root;

    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        if (isEmpty()) {
            root = new StackNode(data);
            return;
        }
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int val = root.data;
            root = root.next;
            return val;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return root.data;
        }
    }

    //Driver code
    public static void main(String[] args) {
        StackAsLinkedList sll = new StackAsLinkedList();
        System.out.println(sll.pop() + " popped from stack");

        sll.push(10);
        sll.push(20);
        sll.push(30);
        System.out.println(sll.pop() + " popped from stack");
        sll.push(40);
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
        sll.push(50);
        System.out.println("Top element is " + sll.peek());

    }
} 
