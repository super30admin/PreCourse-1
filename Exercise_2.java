class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }


    public boolean isEmpty() {
        return root==null;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);

        newNode.next = root;
        root = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        StackNode temp = root;
        root = root.next;
        return temp.data;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
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
