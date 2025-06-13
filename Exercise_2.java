// Time Complexity : O(1) for push,pop,peek
// Space Complexity : O(n) for n elements in the stack.
public class Exercise_2 {

    StackNode root;

    private static class StackNode {
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

    // push element onto stack.
    public void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    }

    // pop the element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int poppedEle = root.data;
            root = root.next;
            return poppedEle;
        }
    }

    // Method to get the top element without removing it
    public int peek() {
        if (isEmpty()) {
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
