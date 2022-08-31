import java.util.Stack;

public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        if (this.root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        //Write code to push data to the stack.

        // Initialize a stack node
        StackNode stackNode = new StackNode(data);
        if (isEmpty()) {
            this.root = stackNode;
        } else {
            stackNode.next = this.root;
            this.root = stackNode;
        }
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int retValue = this.root.data;
            this.root = this.root.next;
            return retValue;
        }
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot peek into an empty stack");
            return 0;
        } else {
            return this.root.data;
        }
    }
}
