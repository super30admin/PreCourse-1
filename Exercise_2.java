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
        if(this.root == null) {
            return true;
        }
        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.

            StackNode newNode = new StackNode(data);
            newNode.next = root;
            root = newNode;

    }

    public int pop()
    {
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }

        int temp = root.data;

        StackNode nodeToDelete = root;
        root = root.next;
        nodeToDelete = null;

        return temp;

    }

    public int peek()
    {
        return root.data;
    }

    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.peek() + " Peak - stackAsLinkedList");
        System.out.println(sll.pop() + " Popped from stackAsLinkedList");
        System.out.println(sll.pop() + " Popped from stackAsLinkedList");
        System.out.println(sll.pop() + " Popped from stackAsLinkedList");
        System.out.println(sll.pop() + " Popped from stackAsLinkedList");
        System.out.println("is stackAsLinkedList empty? "+ sll.isEmpty());
        System.out.println(sll.pop() + " Popped from stackAsLinkedList");
        sll.push(40);
        System.out.println(sll.peek() + " Peak - stackAsLinkedList");
        System.out.println("is stackAsLinkedList empty? "+ sll.isEmpty());
    }
}
