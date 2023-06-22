class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
            //Constructor here
        }
    }

    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode temp = new StackNode(data);
        temp.data = data;
        temp.next = root;
        root = temp;
        System.out.println("push");

    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (root == null) {
            return 0;
        }
        StackNode temp;
        StackNode temp1 = new StackNode(root.data);
        root.data = temp1.data;
        temp = root.next;
        root = temp;
        return temp1.data;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (root == null) {
            return 0;
        }
        return root.data;
    }

    //Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);
        if(sll.isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Not Empty");
        }
        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}

