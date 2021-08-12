class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data, StackNode next)
        {
            this.data = data;
            this.next = null;
                     //Constructor here
        }
    }


    public boolean isEmpty()
    {
        if (root == null){
            return true;
    }
        return false;
        //Write your code here for the condition if stack is empty.
    }

    public void push(int data)
    {

        StackNode insertNode = new StackNode(data,null);
        StackNode tempNode = root;

        if (root == null){
             root = insertNode;

        }
        else{
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = insertNode;
        }

        //Write code to push data to the stack.
    }

    public int pop()
    {
        if (root ==null){

            System.out.println("stack underflow");
            return 0;
        }
        if (root.next == null){
            int value = root.data;
            root = null;
            return value;

    }
        StackNode tempNode = root;
        while(tempNode.next.next!= null){
            tempNode = tempNode.next;
        }
        int value = tempNode.next.data;
        tempNode.next = null;
        return value;

	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
    }

    public int peek()
    {
        if (root ==null){

            System.out.println("stack underflow");
            return 0;
        }
        if (root.next == null){
            int value = root.data;
            return value;

        }
        StackNode tempNode = root;
        while(tempNode.next.next!= null){
            tempNode = tempNode.next;
        }
        int value = tempNode.next.data;
        return value;
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
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");


    }
}
