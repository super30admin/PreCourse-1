//time complexity: O(n)
//space complexity: 24 bytes
class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next=null;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root==null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if (root==null) {
            root = newNode;
            return;
        }
        StackNode curr = root;
        while (curr.next!=null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode prev = root;
        StackNode curr = root.next;
        while (curr.next!=null) {
            curr=curr.next;
            prev=prev.next;
        }
        prev.next = null;
        return curr.data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            return -1;
        }
        StackNode cur = root;
        while (cur.next!=null) {
            cur=cur.next;
        }
        return cur.data;
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
