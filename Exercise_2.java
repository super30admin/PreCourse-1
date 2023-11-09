// Time Complexity :
// Time complexity for initialization of stack would be O(1)
// Time complexitity for push  = O(1)
// Time complexitity for pop = O(1)
// Time complexitity for peek  = O(1)

// Space Complexity :
// Space complexity for stack would be O(n)
// Space complexitity for push  = O(1)
// Space complexitity for pop = O(1)
// Space complexitity for peek  = O(1)

// Did this code successfully run on Leetcode : Not sure which leetcode question this is

// Any problem you faced while coding this :
// Had to lookup static method
//Had to lookup time and space complexity of linked list
// The first approach which I tried was this way
// 10 -> 20 -> 30   Where root was always at 10. It did not work and had issues with pop and and peek
// Looked up online to find a different approach
// The second approach was this
// 10 <- 20 <- 30 where the root node moves to the newwest element. This helped in removing and adding elements easily.

// Your code here along with comments explaining your approach

public class StackAsLinkedList {

    StackNode root; // Initializing root node

    static class StackNode {
        int data; // Variable to store data
        StackNode next; // node to point at the next node

        StackNode(int data) {
            // Constructor here
            this.data = data;

        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        if (root == null)
            return true;
        else
            return false;
    }

    public void push(int data) {
        StackNode s = new StackNode(data); // New node initialization and declaration
        if (isEmpty()) { // If the stack is empty, root node equals new node
            root = s;
        } else { // If the stack is not empty, root node equals new node and root node's next
                 // pointer points to the previous root node
            StackNode temp = root;
            root = s;
            s.next = temp;
        }
        // Write code to push data to the stack.
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else { // If stack is not empty, return the data in the root node and change root node
                 // to point to root node's next pointer
            int d = root.data;
            root = root.next;
            return d;

        }
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return root.data;

        }
    }

    // Driver code
    public static void main(String[] args) {

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
