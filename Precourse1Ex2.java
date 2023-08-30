// Time Complexity : O(1)
// Space Complexity : O(n)

public class LinkedListStack {
    private Node top;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Add an item to the stack
    public void push(int item) {
        Node newNode = new Node(item);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    // Remove and return the top item from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    // Get the top item without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return top.data;
    }

    // Main method for testing the stack
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        
        System.out.println(stack.isEmpty()); // ans = true
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.isEmpty()); // ans = false
        System.out.println(stack.peek()); // ans = 5
        System.out.println(stack.pop());  // ans = 5
        System.out.println(stack.pop());  // ans =  4
        stack.push(6);
        System.out.println(stack.peek()); // ans = 6
    }
}
