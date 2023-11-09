/* Approach - var length to check the overflow and underflow of stack.
traversing till the node.next is null to perform the push pop peek operations

Time Complxity - O(n)
Space - O(n)

Optmization - Using array or Doubly linkedlist will reduce time cost to O(1). Space will still be O(n)
*/




public class StackAsLinkedList {

    StackNode root;
    int length;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int dataa)
        {
            data = dataa;
            next = null;

        }
    }
    StackAsLinkedList()
    {
        root = new StackNode(-1);
        length = 0;
    }

    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if(length ==0) return true;
        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);

        if(isEmpty())
        {
            root.next = newNode;
        }
        else
        {
            //traverse through the node.next !=null!
            StackNode secondLastNode = traverseTilltheSecondLastNode(root);
            secondLastNode.next.next = newNode;
        }
        newNode.next = null;
        length++;
       // System.out.println("Length  == " +length);
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(isEmpty()) { //if stack is empty!
            System.out.println("Stack Underflow");
            return 0;
        }
        //else run through the list
        StackNode secondLastNode = traverseTilltheSecondLastNode(root);
        StackNode temp = secondLastNode.next;
        secondLastNode.next = null;
        length--;
       // System.out.println("Length = "+length);
        return  temp.data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode secondLastNode = traverseTilltheSecondLastNode(root);
        return secondLastNode.next.data;
    }

    private StackNode traverseTilltheSecondLastNode(StackNode root)
    {
        StackNode curr = root;
        while(curr.next!=null && curr.next.next !=null)
        {
            curr = curr.next;
        }
        return curr;

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
