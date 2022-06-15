// Time Complexity : O(n)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : N/A
class StackNode {
    int data;
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
        if(root == null){ // comparing whether
            return true;
        }
        return false;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        StackNode currNode = root;
        if (root == null) {
            root = newNode;
        } else {
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            newNode.prev = currNode;
            currNode.next = newNode;
        }
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        StackNode currNode = root;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        int result = currNode.data;
        currNode.prev.next = null;
        return result;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        StackNode currNode = root;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        int result = currNode.data;
        return result;
    }
}
  
//	//Driver code
//    class Main2 {
//        public static void main(String[] args) {
//
//            StackAsLinkedList sll = new StackAsLinkedList();
//            sll.push(10);
//            sll.push(20);
//            sll.push(30);
//            System.out.println(sll.pop() + " popped from stack");
//            System.out.println("Top element is " + sll.peek());
//        }
//    }

