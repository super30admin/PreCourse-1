//****DESIGN STACK USING LINKEDLIST****
//time complexity : o(1);
//space complexity:

// Java program to Implement a stack
// using singly linked list
// import package
import static java.lang.System.exit;

// Create Stack Using Linked list
class StackUsingLinkedlist {

	// A linked list node
	private class Node {
        int data; 
		Node next;
	}
	Node top;
	// Constructor
	StackUsingLinkedlist()
	{
		this.top = null;
	}
	public void push(int x) // insert at the beginning
	{
	    Node temp=new Node();
	    temp.data=x;
	    temp.next=top;
	    top=temp;
		
	}

	public boolean isEmpty()
	{
		return top==null;
	}

	public int peek()
	{
	    if(top==null)
	    {
	        return 0;
	    }
	    else
	    {
	        return top.data;
	    }
		
	}

	public void pop() // remove at the beginning
	{
	    top=top.next;
		
	}

	public void display()
	{
        if (top == null) 
        {
            System.out.printf("\nStack Underflow");
            
        }
        else 
        {
            Node temp = top;
            while (temp != null) 
            {
 
                System.out.printf("%d->", temp.data);
 
                temp = temp.next;
		    }
        }
    }
}
// main class
public class GFG 
{
	public static void main(String[] args)
	{
		// create Object of Implementing class
		StackUsingLinkedlist obj = new StackUsingLinkedlist();
		// insert Stack value
		obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);

		// print Stack elements
		obj.display();

		// print Top element of Stack
		System.out.printf("\nTop element is %d\n", obj.peek());

		// Delete top element of Stack
		obj.pop();
		obj.pop();

		// print Stack elements
		obj.display();

		// print Top element of Stack
		System.out.printf("\nTop element is %d\n", obj.peek());
	}
}

