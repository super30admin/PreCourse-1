// Time Complexity - Push, Pop, Peek - O(1)
// Space Complexity - O(1)

public class StackAsLinkedList {

    StackNode root;

    private int size = 0;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            //Constructor here
            this.data = data;
        }
    }


    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        return size == 0;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        // Create a node with data
        StackNode sn = new StackNode(data);
        sn.next = root;
        root = sn;
        size++;
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        // Get the head data and delete it
        int data = root.data;

        root = root.next;
        size--;

        return data;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        return root.data;
    }

    //Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
} 
