public class StackAsLinkedList { 
  // Time Complexity : O(1);
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode( int data) {
            // Constructor here
            this.data = data;
        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        return root == null ? true : false;
    }

    public void push( int data) {
    
        // Root is null then assign new node to root. If root is not null then assign temporary vairable which takes root 
        //and assign new node to the root as it goes to the top of stack. And Point the new node to the address of previously assigned root.
         StackNode st = new StackNode(data);
        if (root == null) {
            root = st;
        } else {
             StackNode tmp = root; 
            root = st;
            st.next = tmp;

        }
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        int tmp = 0;
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            // to pop the element from top of the stack just point the refernce of root to the next node that will previously assigned root.
            tmp = root.data;
            root = root.next;
        }
        return tmp;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (root == null) {
            return 0;
        }
        return root.data;
    }

    // Driver code
    public static void main( String[] args) {

         StackAsLinkedList sll = new StackAsLinkedList();
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
