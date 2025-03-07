class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty() {
        return root == null;

    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);

        newNode.next = root;
        root = newNode;

    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int temp = root.data;
        root = root.next;
        return temp;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return root.data;
    }
}

//Driver code
class Main {
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
        System.out.println("is stack empty: " + sll.isEmpty());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
        System.out.println("is stack empty: " + sll.isEmpty());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
        System.out.println("is stack empty: " + sll.isEmpty());
    }
}

// Time complexity: O(1) for all operations, since none of the operations require iteration over n elements.
// Space complexity: O(n) space usage grows linearly with the number of elements stored in the stack.

/**
 * Implementing stack using linkedlist is efficient than using an array as
 * LinkedList allows dynamic size allocation
 * Only downside is extra memory used to store next pointers.
 */