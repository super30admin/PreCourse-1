
// tc - o(1) since we are adding to the head of the linked list , sc o(N)
import javax.naming.NameAlreadyBoundException;
import javax.swing.RootPaneContainer;
import javax.swing.text.rtf.RTFEditorKit;

public class Exercise_2 {

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

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        return root == null;

    }

    public void push(int data) {
        // Write code to push data to the stack.
        // go to the head of the linked list
        if (root == null) {
            root = new StackNode(data);
            return;
        }
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;

    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        // Remove from the head of the linked list
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;

        }
        int top = root.data;
        root = root.next;
        return top;

    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (root == null) {
            // no element to peek
            return -1;
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
        sll.push(40);
        sll.push(50);
        System.out.println("Check isEmpty " + sll.isEmpty());
        sll.push(60);
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());

    }
}