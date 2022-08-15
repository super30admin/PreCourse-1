class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;
    }

    StackAsLinkedList() {
        this.root = null;
    }

    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        if (root == null) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode();

        newNode.data = data;
        newNode.next = root;
        root = newNode;
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (root == null) {
            return 0;
        } else {
            StackNode node = root;
            root = root.next;
            return node.data;
        }
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (!isEmpty()) {
            return root.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
}
	//Driver code
class SllMain{
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
