/**
 * Author: Amish Papneja
 * Time Complexity: All operations: O(1)
 * Space Complexity: O(n) where n is the current number of elements present in the stack
 * Leetcode run: NA
 * Problems faced: None
 */
class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data){
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty(){
        return this.root == null;
    }

    public void push(int data){
        StackNode newNode = new StackNode(data);
        if (this.root != null) {
            newNode.next = this.root;
        }
        this.root = newNode;
    }

    public int pop(){
        if(this.root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int top = this.root.data;
            this.root = this.root.next;
            return top;
        }
    }

    public int peek(){
        return this.root.data;
    }

	//Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();
        sll.pop();
        System.out.println(sll.isEmpty());
        sll.push(10);
        sll.push(20);
        sll.push(30);
        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
} 
