// Time Complexity : O(1)
// Space Complexity : O(n)
// Code runs correctly for the test cases provided.

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

    // Method to check if list is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Method to add a new element to the list
    public void push(int data) {
        StackNode new_node = new StackNode(data);
        new_node.next = root;
        root = new_node;
    }

    // Method to remove the top element if not empty
    public int pop() {
        if (root == null) {
            System.out.println("Stack underflow");
            return 0;
        }
        int element = root.data;
        root = root.next;
        return element;
    }

    // Method to retrieve the top element
    public int peek() {
        if (isEmpty())
            return 0;
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
