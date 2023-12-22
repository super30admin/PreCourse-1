
//tc: push, pop, peek - traverse method takes O(N)
//can be optimized with a continus monitoring tail pointer, or Doubly linkedList
//sc: O(N) for nodes!
public class StackAsLinkedList {

    StackNode root;
    int length;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;
        }
    }

    public StackAsLinkedList() {
        length = 0;
        root = new StackNode(-1);
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        if (length == 0)
            return false;
        return true;
    }

    public StackNode traverse() {
        StackNode curr = root; // 1- 2 - 3
        while (curr.next != null && curr.next.next != null) {
            curr = curr.next;
        }
        return curr;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        // Write code to push data to the stack.
        if (length >= 1000) {
            System.out.print("Stack Overflow");
        } else {
            if (length == 0)
                root.next = newNode;
            else {
                StackNode node = traverse();
                node.next = newNode;
            }
            length++;
        }
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if (!isEmpty()) {
            StackNode node = traverse();
            StackNode popped = node.next;
            node.next = null;
            length--;
            return popped.data;
        } else {
            System.out.print("Stack is Emplty");
            return -1;
        }
        // Write code to pop the topmost element of stack.
        // Also return the popped element
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (!isEmpty()) {
            StackNode node = traverse();
            return node.next.data;
        } else {
            System.out.print("Stack is Emplty");
        }
    }

    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
