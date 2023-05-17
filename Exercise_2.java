public class Exercise_2 {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;
        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        if (root == null) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode newElement = new StackNode(data);
        if (root == null) {
            root = newElement;
            return;
        }
        StackNode tempVariable = root;
        root = newElement;
        newElement.next = tempVariable;
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        int poppedElement;
        if (root == null) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        poppedElement = root.data;
        root = root.next;
        return poppedElement;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (root == null) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        return root.data;
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
