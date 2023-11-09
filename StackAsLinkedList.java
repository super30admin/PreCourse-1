// Time Complexity : O(1) for push, pop and peek operations as we will be
// Space Complexity : 0(n) i.e size of static array
// Any problem you faced while coding this : No

public class StackAsLinkedList {

    StackNode root;
    int length = 0;
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
        return  (length == 0);
    }

    public void push(int data)
    {
        StackNode newNode = new StackNode(data);

        if (root == null) {
            root = newNode;
        }
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        length++;
        System.out.println(data + " pushed to stack");
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        int poppedNode= 0;
        if (length == 0) {
            System.out.println("Stack Underflow");
        }
        else {
            poppedNode = root.data;
            root = root.next;
            length--;
        }
        return poppedNode;
    }

    public int peek()
    {
        if (length == 0) {
            System.out.println("Stack is Empty");
            return 0;
        }
        else {
            return root.data;
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
