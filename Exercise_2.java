public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;
        StackNode previous;
    }

    void StackAsLinkedList() {
        this.root = null;
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else
            return false;
    }

    public void push(int data) {
        StackNode temp = new StackNode();
        if (temp == null) {
            System.out.print("\nHeap Overflow");
        }
        if (root==null){
            // System.out.println("In if");
            // root=new StackNode();
            temp.data=data;
            temp.next=null;
            temp.previous=null;
            root=temp;
        }
        else{
            // System.out.println("In else");
            temp.data = data;
            temp.previous=root;
            root.next = temp;
            temp.next=null;
            root = temp;
        }

    }

    public int pop() {
        int pop_data;
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (root == null) {
            System.out.print("\nStack Underflow");
            return 0;
        }
        pop_data = root.data;
        // update the top pointer to point to the next node
        root = (root).previous;
        return pop_data;
    }

    public int peek() {
        if (!isEmpty()) {
            return root.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }

}
