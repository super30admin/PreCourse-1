public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            next = null;
            data = -1;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty. \
        return root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode temp = new StackNode(-1);
        if( temp == null){
            System.out.println("stack overflow");
            return;
        }
        temp.data = data;
        temp.next = root;
        root = temp;

    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (root == null) {
            System.out.print("\nStack Underflow");
            return -1;
        }
        //Write code to pop the topmost element of stack.
        StackNode popped = new StackNode(-1);
        popped.data = root.data;
        root = root.next;
        //Also return the popped element
        return popped.data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if (!isEmpty()) {
            return root.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
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
