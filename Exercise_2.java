/* Removed public to remove compilation error, of class and file name mismatch*/
class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            next = null;
        }
    }


    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        StackNode temp = root;
        if (temp == null) {
            root = new StackNode(data);
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new StackNode(data);
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        StackNode temp = root;
        if (temp == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        StackNode prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;

        }
        int val = temp.data;
        temp = null;
        if (prev != null) {
            prev.next = null;
        }
        return val;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        /*This method should return null, if stack is empty, even O can be one of the elements*/
        if (root == null) return 0;
        StackNode temp = root;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
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
