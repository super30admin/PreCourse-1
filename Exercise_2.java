/*
Author: Akhilesh Borgaonkar
Problem: Implement stack using LinkedList
Approach: Used LinkedList to reproduce the basic functionality of stack.
Time complexity: push(), pop(), peek() - O(n) where n is number of elements currently in the stack.
Space complexity: O(n) where n is number of elements currently in the stack.
Verified functionality on local machine.
*/

public class Exercise_2 {

    public static class StackAsLinkedList {

        StackNode root;

        static class StackNode {
            int data;
            StackNode next;

            StackNode(int data) {
                this.data = data;
            }
        }


        public boolean isEmpty() {
            //stack is empty if root is null
            return root == null;
        }

        public void push(int data) {
            StackNode temp = root;

            //if stack has existing nodes in it
            if (!isEmpty()) {
                while (temp.next != null) { //find the last node available in the stack
                    temp = temp.next;
                }
                temp.next = new StackNode(data);
            } else {                        //if stack is empty then create a new node and insert
                root = new StackNode(data);
            }
        }

        public int pop() {
            //pop the topmost element of stack.
            if (!isEmpty()) {                   //if stack has existing nodes in it
                StackNode temp = root;
                while (temp.next.next != null)  //find the topmost element in the stack
                    temp = temp.next;
                int popElement = temp.next.data;
                temp.next = null;               //remove the top from stack
                return popElement;
            }

            //If Stack Empty Return 0 and print "Stack Underflow"
            System.out.println("Stack Underflow");
            return 0;
        }

        public int peek() {

            if (!isEmpty()) {               //if stack has existing nodes in it
                StackNode temp = root;
                while (temp.next != null)   //find the topmost node in the stack
                    temp = temp.next;

                return temp.data;
            }
            //if stack is empty then returning 0
            return 0;
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
}