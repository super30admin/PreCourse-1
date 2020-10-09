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
        return root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newStackNode = new StackNode(data);
        if(root==null){
            root = newStackNode;
        }else {
            StackNode head = root;
            while(head.next!=null){
                head = head.next;
            }
            head.next = newStackNode;
        }

    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(root==null){
            System.out.println("Stack Underflow" );
            return 0;
        } else {
            StackNode head = root;
            StackNode previous = null;
            while (head.next!=null){
                previous=head;
                head=head.next;
            }
            int value = head.data;
            previous.next=null;
            return value;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(root==null){
            System.out.println("Stack Underflow, empty stack" );
            return 0;
        } else {
            StackNode head = root;
            while(head.next!=null){
                head=head.next;
            }
            return head.data;
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
