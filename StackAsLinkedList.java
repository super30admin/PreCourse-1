// time complexity 0(1)
// space complexity 0(n)
// getting difficulty in calculating space complexity 
public class StackAsLinkedList {

    StackNode root = null;

    //Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");


        System.out.println("Top element is " + sll.peek());
    }
// to check if there is no node
    public boolean isEmpty() {
        return root == null;
    }
// to push new node in stack
    public void push(int data) {
// create new node
        StackNode temp = new StackNode(data);
        // heap is exhausted
        if (temp == null) {
            System.out.println("\n Heap Exhausted");
        }
        // to insert first we insert data in new node than we insert the address in new node of second node that we get from top and in top we put address of new node
        else {
            temp.data = data;
            temp.next = root;
            root = temp;

        }

    }
// to pop elements


    public int pop() {
        // to check if stack is  empty
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        // if not empty put root.next in root
        else {
            int temp = root.data;
            root = (root).next;
            return temp;

        }
    }
// if stack is not empty just return root.data
    public int peek() {
        if (!isEmpty()) {
            return root.data;
        } else {
            System.out.println("Stack is Empty");
        }
        return -1;

    }
// creating a node
    static class StackNode {
        int data;
        StackNode next;
// constructor
        StackNode(int data) {
            this.data = data;
            next = null;

        }
    }
}