public class Exercise_2 {// StackAsLinkedList

    static StackNode top; // this is like head.

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;
            this.next = null;
        }

    }

    private int topData;

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        if (top == null)
            // System.out.println("Stack is empty");
            return true;
        return false;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next = top;

        top = newNode;
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        }
        // Write code to pop the topmost element of stack.
        else
            topData = top.data;
        top = top.next;
        // Also return the popped element
        return topData;

    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (!isEmpty()) {
            return top.data;
        } else {
            return -1;
        }
    }

    // Driver code
    public static void main(String[] args) {

        Exercise_2 sll = new Exercise_2();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
