// Implement a Stack using Linked List
// Time Complexity : O(1) for push, pop, and peek operations
// Space Complexity : O(n) where n is the number of elements in the stack
class StackAsLinkedList {

    StackNode head = null;

    static class StackNode {
        int data;
        StackNode next;

        // Constructor
        StackNode(int value) {
            data = value;
            next = null;
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        if (head == null) {
            return true;
        }
        return false;
    }

    // Method to push data onto the stack
    public void push(int data) {
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
          node.next = head;
          head = node;
          System.out.println(data + " pushed to stack");
    }

    // method to pop data off the stack
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

    // method to return top element of stack
    public int peek() {
        //Write code to just return the topmost element without removing it.
        return head.data;
    }
}


// Driver code
class StackAsLinkedListTest {
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
