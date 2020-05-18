public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if (root == null) return true;
        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);

        if (isEmpty()) {
            root = newNode;
        } else {
            newNode.next = root;
            root = newNode;
        }
    }

    public String pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) return (0 + " Stack Underflow");
        //Write code to pop the topmost element of stack.
        int temp = root.data;
        root = root.next;
        //Also return the popped element
        return (temp + " popped from stack");
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) return 0;
        return root.data;
    }

    //Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(40);

        System.out.println(sll.pop());
        System.out.println(sll.pop());
        System.out.println(sll.pop());
        System.out.println(sll.pop());
        System.out.println(sll.pop());

        System.out.println("Top element is " + sll.peek());
    }
}