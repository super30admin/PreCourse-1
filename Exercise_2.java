class StackAsLinkedList {
    StackNode root = new StackNode(-1, null);

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data, StackNode next)
        {
            //Constructor here
            this.data = data;
            this.next = next;
        }
    }

    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root.next == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode temp = root.next;
        if (temp == null){
            root.next = new StackNode(data,null);
            System.out.println("first elem");
        }
        else {
            while(temp.next != null){
                temp =  temp.next;
            }
            StackNode insertedNode = new StackNode(data, null);
            temp.next = insertedNode;
            insertedNode.next = null;
            System.out.println("size > 0");
        }

    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        StackNode temp = root.next;
        if (temp == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        if(temp.next == null){
            root.next = null;
            return temp.data;
        }
        while(temp.next.next != null) {
            temp = temp.next;
        }
        int d = temp.next.data;
        temp.next = null;
        return d;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        StackNode temp = root.next;
        if (temp == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        if(temp.next == null){
            return temp.data;
        }
        while(temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

	//Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();
        System.out.println(sll.isEmpty());
        sll.push(10);
        sll.push(20);
        System.out.println(sll.isEmpty());
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.isEmpty());
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.isEmpty());
    }
}
