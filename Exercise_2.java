// Time Complexity :
/*  push: O(1)
    pop: O(1)
    peek: O(1)
    empty: O(1) */

// Space Complexity : O(n) where n = number of nodes

// Did this code successfully run on Leetcode : Yes

// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/*  StackNode constructor : Assigning initial node variable and it is pointing to null.
    StackAsLinkedList constructor : StackNode root is declared, we need to initialize instance variable
    isEmpty function : check if there is any value in node by checking the value of root. If root is null that means stack is empty.
    push function :  Create a new node to be pushed. Since we implement stack as linkedList, we need to add the node before the previous node.
    pop function : stack will be Underflow if root is null. to follow LIFO pattern, we remove the last element addded and then move the root pointer to next node.
    peek function :  print the last element added in the linkedList. */

class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        // Assigning initial node variable and it is pointing to null.
        StackNode(int data) {
            // Constructor here
            this.data = data;
            this.next = null;
        }
    }

    // StackNode root is declared, we need to initialize instance variable
    StackAsLinkedList() {
        this.root = null;
    }

    // check if there is any value in node by checking the value of root. If root is
    // null that means stack is empty.
    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        return root == null;
    }

    // Create a new node to be pushed. Since we implement stack as linkedList, we
    // need to add the node before the previous node.
    public void push(int data) {
        // Write code to push data to the stack.
        StackNode node = new StackNode(data);
        // assigning the new node before the previous node i.e. root.
        node.next = root;
        // move root to the new node.
        root = node;
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // stack will be Underflow if root is null.
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // Write code to pop the topmost element of stack.
        // remove the last element addded and then move the root pointer to next node.
        int element = root.data;
        root = root.next;
        // Also return the popped element
        return element;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        return root.data;
    }
}

// Driver code
class Exercise_2 {
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
