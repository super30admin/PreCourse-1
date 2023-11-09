// Time Complexity :  O(1)
// Space Complexity : O(1)

// Code 

//push , pop is done at beginning(root) of linked list
public class StackAsLinkedList {

    StackNode root;

    class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;       //initializing constructor
        }
    }

    public boolean isEmpty() {
        if (root == null) {
            System.out.println("stack is empty");
            return true;
        }else{
            return false;
        }
    }

    public void push(int data) {
        StackNode temp = new StackNode(data);
        temp.data = data;
        temp.next = root;
        root = temp;
    }

    public int pop() {
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int x = root.data;
            root = root.next;
            return x;

        }
    }

    public int peek() {
        return root.data;      //returning top element through root as addition has been done at beginning of linkedlist
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
