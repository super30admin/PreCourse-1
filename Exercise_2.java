/**
 * Space complexity - o(n) where n number of max elements
 * Time complexity -
 *  isEmpty - o(1)
 *  push - o(1)
 *  pop - o(1)
 *  pop - o(n) - where n is number of elements in the stack
 */
public class StackAsLinkedList {

    StackNode root;
    StackNode top;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode stackNode = new StackNode(data);
        if (top == null) {
            top = stackNode;
            root = top;
        } else {
            top.next = stackNode;
            top = top.next;
        }
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }

        StackNode temp = root;
        while (temp.next != top) {
            temp = temp.next;
        }
        int poppedElement  = top.data;
        temp.next = null;
        top = temp;
        return poppedElement;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return top.data;
    }

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
