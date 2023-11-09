public class StackAsLinkedList {

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

    // o(1)
    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if(root==null){
            return true;
        }
        return false;
    }

    // o(1)
    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if(root==null){
            root=node;
        }
        StackNode temp = root;
        root = node;
        node.next=temp;

    }

    //o(1)
    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if(root==null){
            System.out.println("Stack underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        StackNode temp = root;
        root = root.next;
        temp.next = null;
        //Also return the popped element
        return temp.data;
    }

    // o(1)
    public int peek()
    {
        //Write code to just return the topmost element without removing it.
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