// Time Complexity : isEmpty() - O(1), pop() : O(1) , push() : O(1) , peek() : O(1)
// Space Complexity : O(N) -- where N is the number of elements we're inserting in the stack
class StackAsLinkedList {
    StackNode root;
    static class StackNode {
        int data;
        StackNode next;
        StackNode(int data)
        {
            this.data = data; // initialize data
            this.next = null; // initialize next to point to null
        }
    }

    public boolean isEmpty()
    {
        if (root == null) {
            return true;
        }
        else{
            return false;
        }
    }

    public void push(int data)
    {
        StackNode node = new StackNode(data);
        if (isEmpty()) {
            root = node;
        }
        else{
            node.next = root;
            root = node;
        }
    }

    public int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int temp = root.data;
            root = root.next;
            return temp;
        }
    }

    public int peek()
    {
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
