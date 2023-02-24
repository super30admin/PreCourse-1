public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty()
    {
        return root == null;
    }

    public void push(int data)
    {
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    }

    public int pop()
    {
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int i = root.data;
        root = root.next;
        return i;
    }

    public int peek()
    {
        if(root == null){
            System.out.println("Stack is empty");
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
        sll.push(40);
        sll.push(50);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        //System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
} 
