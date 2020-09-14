public class StackAsLinkedList { 

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;
        StackNode prev;

        StackNode(int data)
        {
        	this.data = data;

        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
    	return  root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
    	StackNode curr = new StackNode(data);
    	if(root == null) {
    		root = curr;
    	}
    	else {
    	root.next = curr;
    	curr.prev = root;
    	root = curr;
    	}
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else {
    		int x =  root.data;
    		StackNode temp = root.prev;
    		if(root.prev != null) {
    			root.prev.next = null;
    			root.prev = null;
    		}
    		root = temp;
    		return x;
    	}
    }


    public int peek()
    {
        //Write code to just return the topmost element without removing it.
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else {
    		return root.data;
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
