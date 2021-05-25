class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if (root == null) {
            System.out.println("Stack Empty");
            return true;
        }

        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode temp_node = new StackNode(data);

        if (root == null) {
            root = temp_node;
        } else {
            // There is already an existing node. put the new element on the start
            temp_node.next = root;
            root = temp_node;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
    
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int popped = root.data;
        root = root.next;
        
        return popped;

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            return -1;
        }

        return root.data;
    } 

    // Time Complexity: O(1)
    // Space Complexity: O(n)
  
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
