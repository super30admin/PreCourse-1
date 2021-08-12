public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            //Constructor here
            this.data = data;
            next = null;
        }
    }


    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        return null == root ? true : false;

    }

    public void push(int data) {

        //Write code to push data to the stack.
        if (isEmpty()) {
            root = new StackNode(data);
        } else {
            StackNode temp = root;
            StackNode newNode = new StackNode(data);

            while (null != temp.next) {

                temp = temp.next;

            }
            temp.next = newNode;
        }
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        StackNode temp = root;
        StackNode temp2 = root.next;

        while (null != temp2.next) {

            temp = temp2;
            temp2 = temp2.next;
        }

        temp.next = temp2.next;
        return temp2.data;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        StackNode temp = root;

        while (null != temp.next) {

            temp = temp.next;
        }

        return temp.data;
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
