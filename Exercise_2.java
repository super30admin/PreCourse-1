package s30.preCourse1;

public class StackAsLinkedList {
    StackNode root;

    static class StackNode {
        int data;
        StackNode next;
        StackNode(int data)
        {
            this.data = data;
        }
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void push(int data)
    {
        if(root == null) {
            root = new StackNode(data);
        } else {
            StackNode nextNode = new StackNode(data);
            nextNode.next = root;
            root = nextNode;
        }

    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int num = root.data;
            root = root.next;
            return num;
        }
    }

    public int peek()
    {
        if(root == null ) {
            System.out.println("System Underflow");
            return 0;
        } else {
            return root.data;
        }
    }

    //Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
