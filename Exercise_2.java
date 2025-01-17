// Time Complexity : Push, Pop, Peek : O(n).
// Space Complexity : O(n) - To store n stack elements.
// Did this code successfully run on Leetcode : Did not find the problem on leetcode.
// Any problem you faced while coding this : No.

class StackAsLinkedList {

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
        return (root == null); //If root is null, stack is empty.
    }

    public void push(int data) { //If stack is empty, create a root element. Else add new node at the end of the list.
        //Write code to push data to the stack.
        if (isEmpty()) {
            root = new StackNode(data);
        }
        StackNode ptr = root;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new StackNode(data);
    }

    public int pop() { //If stack is empty, return 0. Else check is stack only has root element, return it and make stack empty. Else traverse till end of the list and return the last node.
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        }
        if (root.next == null) {
            int data = root.data;
            root = null;
            return data;
        }
        StackNode ptr = root;
        StackNode prev = ptr;
        while (ptr.next != null) {
            prev = ptr;
            ptr = ptr.next;
        }
        prev.next = null;
        return ptr.data;
    }

    public int peek() { //If stack is empty, return 0. Else traverse till end of the list and return last node.
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        }
        StackNode ptr = root;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        return ptr.data;
    }
}

class Main_SLL {
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
