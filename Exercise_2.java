/*
1. Time Complexity : All operations (isEmpty, push, pop, peek) - O(1)
2. Space Complexity : O(n)
3. Did this code successfully run on Leetcode :
4. Any problem you faced while coding this : -
 */

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

    StackAsLinkedList() {
        // initialise root to null
        root = null;
    }

    public boolean isEmpty() { 
        return root == null;
    } 
  
    public void push(int data) {
        // add node to the head of the linkedlist
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    }

    public int pop() {
        // check if list is empty
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // return the root of the linkedlist
        StackNode n = root;
        root = n.next;
        n.next = null;
        return n.data;
    }

    public int peek() 
    {
        // check if list is empty
        if (root == null) {
            System.out.println("Stack is Empty");
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
