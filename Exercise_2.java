// Time Complexity : O(1) for all the functions
// Space Complexity : O(n), storing the values in LinkedList and root pointer is constant space

public class Exercise_2 {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        StackNode current = new StackNode(data);
        if (root == null) {
            root = current;
        } else {
            current.next = root;
            root = current;
        }
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode toBePopped = root;
        root = root.next;
        return toBePopped.data;
    }

    public int peek() {
        if (root == null) {
            System.out.println("Stack is Empty");
            return 0;
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
