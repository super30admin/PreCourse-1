class StackAsLinkedList {

    // Time Complexity : O(1) and O(N) for printStack
    // Space Complexity : N*SizeOf(StackNode) + temp variables
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : While determining complexity
    // Your code here along with comments explaining your approach
    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        // if root pointing null, then no node added
        return root == null;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode new_node = new StackNode(data);
        // If root not null, then adding the new node will point to previous root
        if (root != null) {
            new_node.next = root;
        }
        // root will be pointing always to new node added
        root = new_node;
        printStack();
    }

    public int pop() {
        int popElem = 0;

        //Write code to pop the topmost element of stack.
        if (isEmpty()) {
            //If Stack Empty Return 0 and print "Stack Underflow"
            System.out.println("Stack Underflow");
            return 0;
        } else {
            popElem = root.data;
            root = root.next;
        }
        //Also return the popped element
        return popElem;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("No elements present, root found NULL");
        } else {
            // The top here is root, so returning the data in root node
            return root.data;
        }
        return 0;
    }

    public void printStack() {
        StackNode temp = root;
        while (temp != null) {
            // Print the data at current node
            System.out.print(temp.data + "->");
            // Go to next node
            temp = temp.next;
        }
        System.out.println("END");
    }

    //Driver code
    public static void main(String[] args) {


        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(40);

        sll.printStack();


        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
