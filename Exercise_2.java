// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : No

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
        // If root is null, stack is empty
        return root == null;
    }

    public void push(int data) {
        StackNode s = new StackNode(data);
        // Linking the current node to the previous node
        s.next = root;
        // Pointing the root to the current node
        root = s;
    }

    public int pop() {
        if (isEmpty()) {
            // Checking if stack is empty then printing stack underflow
            System.out.println("Stack Underflow");
            return 0;
        } else {
            // If not empty, removing the topmost element following LIFO
            StackNode topElement = root;
            // Detaching it by changing the root pointer to the second last element
            root = root.next;
            return topElement.data;
        }
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        return root.data;
    }

    // Driver code
    public static void main(String[] args) {

        Exercise_2 sll = new Exercise_2();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");
        // System.out.println(sll.pop() + " popped from stack");
        // System.out.println(sll.pop() + " popped from stack");
        // System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
