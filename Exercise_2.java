public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data=data;  //Constructor here
        }
    }


    public boolean isEmpty()
    {
        if( top == -1){
            return true;


        }
        else{

            return false;
        }
        //Write your code here for the condition if stack is empty.
    }

    public void push(int data)
    {
        //Write code to push data to the stack.

        StackNode tempNode=new StackNode(data);
        tempNode.next=top;
        top=tempNode;
        int size;
        size++


    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(isEmpty() == true)
        {
            System.out.println("Stack Underflow");
            return 0;
        }

        int result=top.data;
        top=top.next;
        int size--1;
        return result;



    }

}

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return top.data;
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