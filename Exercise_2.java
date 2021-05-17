class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            //Constructor here
            this.data = data;
        }
    }


    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        return (root == null); //if the stack is empty
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode addElement = new StackNode(data);
        addElement.next = root;
        root = addElement;
        System.out.println("Pushed element" + root.data);

    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element

        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int returnPoppedValue = root.data;
        root = root.next;
        return returnPoppedValue;

    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (!isEmpty()) {
            return root.data;
        } else {
            System.out.println("No element in the stack as it is empty");
            return -1;
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
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());

        sll.push(40);
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());

    }

}
