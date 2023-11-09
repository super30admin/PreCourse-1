// Time Complexity : Insert(Push) - O(1), Search = O(n), Delete(Pop) - O(1),
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Did not found problem
// Any problem you faced while coding this : no

public class StackAsLinkedList {

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
        //Write your code here for the condition if stack is empty.
        if (root == null) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        StackNode node = new StackNode(data);
        //Write code to push data to the stack.
        if (isEmpty()) {
            root = node;
            return;
        }
        node.next = root;
        root = null;
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        //Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int i = root.data;
        root = root.next;
        return i;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int i = root.data;
        return i;
    }


        public static void main(String args[])
        {
            StackAsLinkedList s = new StackAsLinkedList();
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
            s.push(60);

            System.out.println(s.pop() + " Popped from stack");
            System.out.println(s.pop() + " Popped from stack");
            System.out.println(s.peek() + " Peek from stack");
            System.out.println(s.pop() + " Popped from stack");
            System.out.println(s.pop() + " Popped from stack");
            System.out.println(s.peek() + " Peek from stack");
        }
    }


