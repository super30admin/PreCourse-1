public class StackAsLinkedList {

    StackNode head;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            //Constructor here
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);

        if (!isEmpty()) {
            node.next = head;
        }
        head = node;
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        int topVal = head.data;
        head = head.next;

        //Also return the popped element
        return topVal;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (!isEmpty()) {
            return head.data;
        }
        return -1;
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

