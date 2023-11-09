// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : N/A
class StackNode {
    int data;
    //Creating a doubly linked list
    StackNode next;
    StackNode prev;
    //Implementing it through doubly linkedList.

    //Creating constructors
    StackNode(){

    }
    StackNode(int data) {
        //Constructor here
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    StackNode(int data, StackNode next) {
        //Constructor here
        this.data = data;
        this.next = next;
        this.prev = null;
    }
    StackNode(int data, StackNode next,StackNode prev) {
        //Constructor here
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
public class StackAsLinkedList {

    StackNode root = new StackNode();

    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        if(root == null){ // comparing whether the root is null or not
            return true;
        }
        return false;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data); // creating node with input data
        if (this.root == null){
            root.data = data;
        }else{
            root.next = newNode;
            newNode.prev = root;
            root = root.next;
        }
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        int x = root.data;
        root = root.prev;
        root.next = null;
        return x;

    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        return root.data;
    }
}


