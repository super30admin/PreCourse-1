/*******
Exercise_2 : Implement Stack using Linked List.

Time Complexity :                               O(1)
Space Complexity :                              O(1)  
Did this code successfully run on Leetcode :    N/A (Could not find question number)
Any problem you faced while coding this :       No
*******/

public class Exercise_2 {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        // return if stack is empty.
        if ( root == null ){
            return true;
        }
        return false;
    }

    public void push(int data) {
        // Create a newNode with value 'data'
        StackNode newNode = new StackNode(data);

        // id stack is empty, newNode will be root
        if ( root == null ){
            root = newNode;
        }
        // else add the newNode in the begining of the list
        else {
            StackNode tempNode = root;
            root = newNode;
            root.next = tempNode;
        }
        System.out.println(data + " is pushed into stack");
    }

    public int pop() {        
        // If Stack Empty Return 0 and print "Stack Underflow"
        if ( root == null ){
            System.out.println("Stack Underflow");
            return 0;
        }
        // else pop the topmost element of stack.
        // Also return the popped element
        else {
            StackNode poppedNode = root;
            root = root.next;
            return poppedNode.data;
        }
    }

    public int peek() {
        // if stack is empty, then printing "Stack Underflow"
        if ( root == null ){
            System.out.println("Stack Underflow");
            return 0;
        }
        // else return topmost element without removing it
        else {
            return root.data;
        }
    }

    // Driver code
    public static void main(String[] args) {

        Exercise_2 sll = new Exercise_2();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
