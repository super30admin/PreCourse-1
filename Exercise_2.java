public class StackAsLinkedList {

    // the time complexity for this linked list operations is O(1)
    // the space complexity is O(n) where n is size of the stack

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
        if(root == null) {
            root = newNode;
        }
        else {
            newNode.next = root;
            root = newNode;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop()
    {
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int poppedData = root.data;
        root = root.next;
        return poppedData;
    }

    public int peek()
    {
        if(root == null) {
            System.out.println("Stack is Empty");
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
