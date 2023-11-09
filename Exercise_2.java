
class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return (root == null);
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode tempNode = new StackNode(data);
        if(tempNode == null){
            return;
        }

        tempNode.data = data;
        tempNode.next = root;
        root = tempNode;

    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null){
            System.out.println("Stack Underflow");
            return -1;
        }

        //Write code to pop the topmost element of stack.
        root = root.next;
        //Also return the popped element
        return root.data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()){
            return root.data;
        }
        else
        {
            return -1;
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
