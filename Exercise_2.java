class StackAsLinkedList {

    StackNode head = null;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int value) {
            //Constructor here
            data = value;
            next = null;
        }
    }


    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        if (head == null) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
          node.next = head;
          head = node;
          System.out.println(data + " pushed to stack");
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        //Write code to pop the topmost element of stack.
        //Also return the popped element
         int poppedValue = head.data;
        head = head.next;
        return poppedValue;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        return head.data;
    }
}

class Main2 {
	//Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
