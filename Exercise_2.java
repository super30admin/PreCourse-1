// Time Complexity : O(1) for push, pop, peek functions
// Space Complexity : O(N) - N is the number of elements in stack
// Did this code successfully run on Leetcode : No corresponding leetcode problem
// Any problem you faced while coding this : No
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

    public StackAsLinkedList() {
        this.root = null;
    }


    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        }
        int data = root.data;
        root = root.next;
        return data;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        }
        return root.data;
    }

    //Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
} 
