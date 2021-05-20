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
        return (root == null);
    }

    public void push(int data) {
        StackNode sNode = root;
        root = new StackNode(data);
        root.data = data;
        root.next = sNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int popData = root.data;
            root = root.next;
            return popData;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return root.data;
        }
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
