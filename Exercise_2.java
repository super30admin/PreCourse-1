import java.util.EmptyStackException;

//Push is 0(1)
//Pop is 0(1)
//peek is 0(1)

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
        StackNode NewNode = new StackNode(data);
        NewNode.next = root;
        root = NewNode;
    }

    public int pop()
    {
	    if(isEmpty()){
            throw new EmptyStackException();
        }
        int PoppedElement = root.data;
        root = root.next;
        return PoppedElement;
    }

    public int peek()
    {
        return root.data;
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
