/*
Exercise_2 : Implement Stack using Linked List.
// Time Complexity: O(1) for push, pop, peek, and isEmpty operations
// Space Complexity: O(n)
 */

class StackAsLinkedList {
    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            next = null;
        }
    }


    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        } else {
            newNode.next = root;
            root = newNode;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }

        //Write code to pop the topmost element of stack.
        int poppedElement = root.data;
        root = root.next;

        //Also return the popped element
        return poppedElement;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (root == null) {
            System.out.println("Stack is empty");
            return 0;
        }
        return root.data;
    }

    //Driver code
    public static void main(String[] args) {
        StackAsLinkedList sll = new StackAsLinkedList();
        sll.push(10);
        sll.push(20);
        sll.push(30);
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
    }
} 
