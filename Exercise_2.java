 class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data=data;
            next=null;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
      return root==null;

    }
     //TC:-O(1)
    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newTop=new StackNode(data);
        if(isEmpty()){
            root=newTop;
        }
        else{
            newTop.next=root;
            root=newTop;
        }

    }
     //TC:-O(1)
    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        else{
            int temp=root.data;
            root= root.next;
            return temp;
        }
	//Also return the popped element
    }

    //TC:-O(1)
    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
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
