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

        if (root == null)
        {
            return true;
        }

        return false;
    }

    public void push(int data) {

        StackNode temp = new StackNode(data);

        if (temp == null) {
            System.out.print("Stack Overflow");
            return ;
        }

        temp.next = root;

        root = temp;

        //Write code to push data to the stack.
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"

        if (root == null ){
            System.out.print("Stack Underflow");
            return 0;
        }


        int data = root.data;

        root = root.next;

        //Write code to pop the topmost element of stack.
        //Also return the popped element

        return data;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (isEmpty())
        {
            return 0;
        }
        return root.data;
    }

}

class Exercise_2 {
	//Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}

/*
 time complexity to push and pop is O(1)
 space complexity 0(1)
 */
