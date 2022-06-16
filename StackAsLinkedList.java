// Time Complexity : O(n)
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

    StackNode root;

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
        StackNode currNode = root; //creating other node to work on, so we don't lose the head node.
        if (root == null) { // if root is null then put the given value in head node
            root = newNode;
        } else {
            while (currNode.next != null) { // to traverse to the last node and then insert node there
                currNode = currNode.next;
            }
            newNode.prev = currNode; // connecting the last and new node.
            currNode.next = newNode;
        }
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        StackNode currNode = root; // for reference
        while(currNode.next != null){ //traversing to the last node
            currNode = currNode.next;
        }
        int result = currNode.data; //storing value in int for returning result
        currNode.prev.next = null; // deleting the last node
        return result;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        StackNode currNode = root;
        while(currNode.next != null){
            currNode = currNode.next; //traversing the nodes
        }
        int result = currNode.data;
        return result; //returning the last value.
    }
}


