import java.util.*;

public class StackAsLinkedList {



    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
         this.data = data;
         this.next=null;
         //Constructor
        }
    }
    LinkedList<StackNode> stackList = new LinkedList<>();


    public boolean isEmpty()
    {
        return (stackList.size()==0);
        //Write your code here for the condition if stack is empty.
    }

    public void push(int data)
    {
        // Add data to front of the linkedList
        stackList.addFirst(new StackNode(data));
        //Write code to push data to the stack.
    }

    public int pop()
    {
        if(stackList.isEmpty()) {
            System.out.println("Stack overflow");
            return 0;
        }
        int temp = stackList.getFirst().data;
        stackList.removeFirst();
        return temp;
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
    }

    public int peek()
    {
        if(stackList.isEmpty()) {
            System.out.println("Stack overflow");
            return 0;
        }
        return(stackList.getFirst().data);
        //Write code to just return the topmost element without removing it.
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
