

/* Time Complexity --> 
pop --> O(n)
push --> O(1)
peek --> O(1)
isEmpty --> O(1)

Space Complexity -->
for LinkedList it is O(n)
 */
public class StackAsLinkedList {

    StackNode root = null;
    StackNode tail;

    static class StackNode {

        int data;
        StackNode next;

        StackNode(int data) {
            //Constructor here
            this.data = data;
            this.next = null;

        }
    }

    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.

        return root == null;
    }

    public void push(int data) {
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;

        }

    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element 

        if (root == null) {
            System.out.print("Stack underflow");
            return 0;
        }

        int val = tail.data;
        StackNode curr = root;
        while (curr.next != tail) {
            curr = curr.next;
        }
        return val;

    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            return 0;
        }
        return tail.data;

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
