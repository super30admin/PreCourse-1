/**
 * Space complexity of this solution is O(n)
 */
class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
        } 
    }

    /**
     * Time complexity of isEmpty() operation is O(1)
     */
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    /**
     * Time complexity of push() operation is O(1)
     */
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newStackNode = new StackNode(data);
        if (!isEmpty()) {
            newStackNode.next = root;
        }
        root = newStackNode;
    }

    /**
     * Time complexity of pop() operation is O(1)
     */
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
	    //Also return the popped element
        if(isEmpty())
            return 0;
        else{
            int poppedValue = root.data;
            root = root.next;
            return poppedValue;
        }
    }

    /**
     * Time complexity of peek() operation is O(1)
     */
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
            return 0;
        else
            return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList();
        System.out.println("Is stack empty : " + sll.isEmpty());
        sll.push(10); 
        sll.push(20); 
        sll.push(30);
        System.out.println("Top element is : " +  sll.peek());
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is : " + sll.peek());
        System.out.println("Is stack empty : " + sll.isEmpty());
    } 
} 
