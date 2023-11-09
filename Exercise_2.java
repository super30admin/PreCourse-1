class StackAsLinkedList {
// imlementing stack using linkedlist.

    StackNode root; // The top referencing variable

    static class StackNode {  // the class we created to implement the linked-list it has data and node referencing the next node.
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;   //initializing the data here which is passed form the main method
        }
    }


    public boolean isEmpty()
    {
        //This method checks if the list is empty or not
        if(root==null){
            return true;
        }
        else
            return false;
    }

    public void push(int data)
    {
        //This method check create the new reference and passes the data for the node. Then it checks if the list is not empty
        //By checking root is null and passes the current root to the new node and references the root to new node
        StackNode newStackNode= new StackNode(data);
        if(root==null) {
            root=newStackNode;
        }
        newStackNode.next=root;
        root=newStackNode;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Takes the Integer variable as pooped and passes the top most data. make the last reference and return the pooped data.
        //Also return the popped element
        if(root==null){
            System.out.println("Stack Underflow");
            return 0;
        }else {
            int popped=root.data;
            root= root.next;
            return popped;
        }
    }

    public int peek()
    {
        //Just returns the top most data.
        if(root==null) {

            return 0;
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