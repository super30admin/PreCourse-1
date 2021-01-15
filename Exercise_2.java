public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data ;
            next = null;
        }
    }

    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if (root == null){
            root = newNode;
        }
        else {
            StackNode node = root;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(root == null){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            StackNode node = root;
            StackNode prev = root;
            if(root.next == null){
                root = null;
                return node.data;
            }
            while(node.next!=null){
                prev = node;
                node = node.next;
            }
            prev.next = null;
            return node.data;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if (root == null){
            System.out.println("No element");
            return 0;
        }
        StackNode node = root;
        while(node.next!=null){
            node = node.next;
        }
        return node.data;
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
        // Additional tests
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Is the stack empty?: " + sll.isEmpty());
        sll.push(10);
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Is the stack empty?: " + sll.isEmpty());
    }
}
