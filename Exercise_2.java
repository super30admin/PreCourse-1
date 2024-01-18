// Time Complexity: O(N) for pop, O(1) for all other operations
// Space Complexity: O(N), where N is the number of elements in stack
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
// Used a new node "top" to store imitate top of stack. Manipulating
// it in all the operations
// The pop operation has O(N) because the top node has to be updated everytime
// we pop an element from stack.


class StackAsLinkedList {
    StackNode root;
    StackNode top;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public StackAsLinkedList() {
        root = null;
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        StackNode curr = new StackNode(data);
        if (top == null) {
            root = curr;
            top = curr;
            return;
        }
        top.next = curr;
        top = curr;
        return;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        if (top == root) {
            int data = top.data;
            root = null;
            top = null;
            return data;
        }

        StackNode curr = root;
        while (curr.next != top)
            curr = curr.next;
        int data = top.data;
        top = curr;
        curr.next = null;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
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
