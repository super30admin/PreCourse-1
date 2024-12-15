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
        return root==null;
    }

    public void push(int data)
    {
        if(root == null){
            root = new StackNode(data);
            return;
        }
        StackNode node = root;
        while(node.next!=null){
            node = node.next;
        }
        node.next = new StackNode(data);
    }

    public int pop()
    {
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }

        if(root.next == null){
            int poppedValue = root.data;
            root = null;
            return poppedValue;
        }

        StackNode prev = null;
        StackNode node = root;

        while(node.next!= null){
            prev = node;
            node = node.next;
        }
        prev.next = null;
        return node.data;
    }

    public int peek()
    {

        if(root == null) {
            return 0;
        }

        StackNode node = root;
        while(node.next!= null){
            node = node.next;
        }
        return node.data;
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
    }
}
