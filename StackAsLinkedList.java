public class StackAsLinkedList {

    int size=0;
    StackNode head = new StackNode();

    static class StackNode {
        int data;
        StackNode next;

        StackNode()
        {
            next = null;
        }

        StackNode(int data)
        {
            next = null;
            this.data = data;
        }
    }
    public boolean isEmpty()
    {
        return size==0;
    }

    public void push(int data)
    {
        StackNode temp=new StackNode(data);
        temp.next = head.next;
        head.next=temp;
        size++;
    }

    public int pop()
    {
        if(!isEmpty()) {
            int num = head.next.data;
            head.next = head.next.next;
            size--;
            return num;
        }else {
            System.out.println("Stack Underflow");
            return 0;

        }
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
    }

    public int peek() {
        return head.next.data;
    }
    //Write code to just return the topmost element without removing it.
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
