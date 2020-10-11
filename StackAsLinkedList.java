public class StackAsLinkedList {

    StackNode root;


    StackAsLinkedList(){

    	root=null;
    }

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
        	this.data=data;
        	this.next=null;
            //Constructor here
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
    	if(root==null)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}

    }

    public void push(int data)
    {
    	if(root == null)
    	{
    		root=new StackNode(data);

    	}

    	else {

    		StackNode temp;
    		temp=root;
    		while(temp.next!=null)
    		{
    			temp=temp.next;

    		}

    		StackNode temp1 = new StackNode(data);
    		temp.next=temp1;
    		//temp1.next=null;

    	}

        //Write code to push data to the stack.
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element


    	if(root==null)
    	{
    		System.out.println("Stack Underflow");
    		return 0;
    	}

    	StackNode temp;
    	StackNode temp1;

    	temp=root;
    	temp1=temp;
    	temp=temp.next;
    	while(temp.next!=null)
    	{
    		temp=temp.next;
    		temp1=temp1.next;

    	}

    	temp1.next=null;
    	return temp.data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.

    	StackNode temp;


    	temp=root;


    	while(temp.next!=null)
    	{
    		temp=temp.next;


    	}

    	return temp.data;
    }

	//Driver code
    public static void main(String[] args)
    {
    	System.out.println("Top element is " );
        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
