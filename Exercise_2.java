// Since we are not running any loops on the functions [isEmpty(), push(), pop(), peek()] the time complexity is O(1)
// Since we are not running any loops on the functions [isEmpty(), push(), pop(), peek()] the space complexity is O(1)
// Problems while writing this code: What should be the return value for 'Stack Underflow'

public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.next = null;
        }
    }

    public boolean isEmpty()
    {
        if (root == null) return true;

        return false;
    }

    public void push(int data)
    {
        StackNode temp_node = new StackNode(data);
        if (temp_node == null) {
            System.out.println ("Heap Overflow");
            return;
        }
        temp_node.data = data;
        temp_node.next = root;
        root = temp_node;
    }

    public int pop()
    {
        if (root == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int pop_item = root.data;
        root = root.next;
        return pop_item;
    }

    public int peek()
    {
        if (root != null) {
            return root.data;
        } else {
            System.out.println("Stack Overflow");
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
