// Operation:          push   pop    peek
// Time Complexity:     1      1      1
// Space Complexity:    1      1      1
// Yes, this code ran successfully
// No, I didn't face any problem in this problem

class StackAsLinkedList {

    StackNode root;
    StackNode top;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            //Constructor here
            this.data = data;          // Initializing Node
            next = null;
        }
    }

    StackAsLinkedList() {
        this.top = null;
    }

    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        return top == null;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        root = new StackNode(-1);
        if (root == null)                                // Stack is Full
        {
            System.out.println("Stack Overflow");
            return;
        }
        root.data = data;                              // Stack is not Full
        root.next = top;
        top = root;                                    // setting up top after push operation
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (top == null)                                 // Stack is Empty
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        StackNode popped = new StackNode(-1);     // setting up top after pop operation
        popped = top;
        top = (top).next;
        return popped.data;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (!isEmpty())                  // Stack is not Empty
            return top.data;
        else                            // Stack is empty
        {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

}

public class Exercise_2
{
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
