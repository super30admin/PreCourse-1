public class StackAsLinkedList {
//time complexity =O(1)
//space complexity = O(n)
    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if (isEmpty()) {
            root = newNode;
        } else {
            newNode.next = root;
            root = newNode;
        }

    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element

        int top;
        if (isEmpty() == true) {
            System.out.println("Stack UnderFlow");
            return 0;
        }

        top = root.data;

        root = root.next;


        return top;

    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        int top;
        top = root.data;
        return top;
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
