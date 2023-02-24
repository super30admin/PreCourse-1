public class Exercise_2 {

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
        if (root == null)
        return true;
        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if ( root == null)
        root = newNode;
        else{
        StackNode oldRoot = root;
         root = newNode;
        newNode.next = oldRoot;

        }
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        
	
	if (isEmpty()){
	System.out.println("Stack Underflow");
	return 0;
	}
    //Write code to pop the topmost element of stack.
	int poppedData = root.data;
	root = root.next;
    //Also return the popped element
	return poppedData;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){System.out.println("Stack Underflow");
		return 0;
	}

        return root.data;
    }

	//Driver code
    public static void main(String[] args)
    {

        Exercise_2 sll = new Exercise_2();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
        sll.push(40);
        sll.push(50);
        sll.push(60);
        sll.push(80);
        System.out.println("Top element is " + sll.peek());
    }
}