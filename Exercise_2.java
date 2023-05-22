import java.util.Objects;

class StackAsLinkedList {
    // StackAsLinkedList
    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            next = null;
        }
    }

    public boolean isEmpty() {
        return root.next == null && Objects.isNull(root.data);
        // Write your code here for the condition if stack is empty.
    }

    public void push(int data) {
        StackNode next = new StackNode(data);
        next.next = root;
        root = next;

        // Write code to push data to the stack.
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (isEmpty())
            System.out.println("Stack Underflow");
        StackNode removed = root;
        root = root.next;
        return removed.data;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        return root.data;
    }
}

// Driver code
public class Exercise_2 {
    public static void main(String[] args) {
        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        System.out.println("Top element is " + sll.peek());
        sll.push(20);
        System.out.println("Top element is " + sll.peek());
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
