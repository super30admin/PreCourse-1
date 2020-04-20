
public class StackAsLinkedList { 
	  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(final int data) {
            this.data = data;
            next = null;
        }
    }

    public boolean isEmpty() {
        if (root == null)
            return true;

        else
            return false;

    }

    public void push(final int data) {
        if (root == null) {
             root = new StackNode(data);
        } else {
            final StackNode newNode = new StackNode(data);
            newNode.next = root;
            root = newNode;
        }

        // Write code to push data to the stack.
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is already empty");
            return -1;
        }

        final int toReturn = root.data;
        root = root.next;
        return toReturn;
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("You're staring at the bottom");
            return -1;
        } else
            return root.data;
        // Write code to just return the topmost element without removing it.
    }

    // Driver code
    public static void main(final String[] args) {

         StackAsLinkedList sll = new StackAsLinkedList();
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 

        System.out.println("Top element is " + sll.peek()); 
        
        sll.push(30); 
        sll.push(20); 
        sll.push(30); 

        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
