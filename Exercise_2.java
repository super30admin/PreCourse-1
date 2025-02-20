public class StackAsLinkedList {

    StackNode root = null;
    StackNode current = null;

    static class StackNode {
        int data;
        StackNode next;
        StackNode prev;

        StackNode(int data)
        {
            this.data=data;
            next=null;
            prev=null;
        }
    }


    public boolean isEmpty()
    {
        if (root == null) {
            return true;
        }
        return false;
    }

    public void push(int data)
    {
        if (root == null) {
            root = new StackNode(data);
            current = root;
            System.out.println("root null");
        } else {
            System.out.println("root not null");
            StackNode  newNode = new StackNode(data);
            current.next = newNode;
            newNode.prev = current;
            current = current.next;
        }
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        } else  {
            int data = current.data;
            if (current.prev != null){
                current = current.prev;
                current.next = null;
            } else {
                current = root = null;
            }

            return data;
        }
    }

    public int peek()
    {
        if (isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }
        return current.data;
    }

    //Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        sll.push(40);
        System.out.println("Top element is " + sll.peek());
        sll.push(50);
        System.out.println("Top element is " + sll.peek());

        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.isEmpty());
        System.out.println("Top element is " + sll.peek());
    }
}
