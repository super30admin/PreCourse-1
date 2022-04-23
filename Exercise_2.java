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
    // time complexity O(1)
    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        if (this.root != null) {
            return false;
        } else {
            return true;
        }
    }
    // time complexity O(1)
    public void push(int data) {
        // Write code to push data to the stack.
        // adding node at the head
        StackNode top = new StackNode(data);
        top.next = this.root;
        this.root = top;
    }

    // Time complexity O(1)
    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        // removing top node
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        int top_value = this.root.data;
        this.root = root.next;
        return top_value;
    }

    // Time complexity O(1)
    public int peek() {
        // Write code to just return the topmost element without removing it.
        if(this.isEmpty()){
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
