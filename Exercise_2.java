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

    public boolean isEmpty() {
        return this.root == null;
    }

    public void push(int data) {
        StackNode node = new StackNode(data);
        node.next = this.root;
        this.root = node;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }

        int data = this.root.data;
        this.root = this.root.next;
        return data;
    }

    public int peek() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        return this.root.data;
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
