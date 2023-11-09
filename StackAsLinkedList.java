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
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop()
    {
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int poppedValue = root.data;
        root = root.next;
        return poppedValue;
    }

    public int peek()
    {
        if (root == null) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return root.data;
        }
    }

    public static void main(String[] args)
    {
        StackAsLinkedList stack = new StackAsLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop() + " popped from stack");

        System.out.println("Top element is " + stack.peek());
    }
}
