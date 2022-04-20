import java.util.LinkedList;
import java.util.List;
// Time Complexity : O(n)
// Space Complexity : O(n)
public class StackAsLinkedList {

    //List<StackNode> stackNodes = new LinkedList<>();
    StackNode root = null;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }


    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int result = root.data;
            root = root.next;
            return result;

        }
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        return root.data;
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
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
    }
} 
