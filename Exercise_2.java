//time complexity for all the methods is O(1)
//space complexity for all the methods is O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // initializing the instance variable
            this.data = data;
        }
    }

    public boolean isEmpty() {
        // if root is null , stack is empty else not
        if (root == null)
            return true;
        return false;
    }

    public void push(int data) {

        // newNode object is created
        StackNode newNode = new StackNode(data);

        // if root is null , newNode becomes root
        if (isEmpty()) {
            root = newNode;
        }
        // newNode must be inserted at front
        else {
            newNode.next = root;
            root = newNode;
        }
    }

    public int pop() {

        // If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        // copy data of root node and make root point to it's next node
        int topData = root.data;
        root = root.next;
        return topData;
    }

    public int peek() {
        // if root is empty , return -1
        if (isEmpty())
            return -1;
        // if root is not empty , return data of root node
        return root.data;
    }

// Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);
        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
