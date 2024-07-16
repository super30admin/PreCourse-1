// Time Complexity : O(1)
// Space Complexity : O(n)

class StackAsLinkedList {

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
        StackNode newNode = new StackNode(data);
        if(root == null){
            root = newNode;
        }else{
            StackNode currentNode = root;
            root = newNode;
            newNode.next = currentNode;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int popItem = root.data;
            root = root.next;
            return popItem;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else {
            return root.data;
        }
    }

	//Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(50);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
