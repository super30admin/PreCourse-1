public class StackAsLinkedList { 

    /*
     * Time Complexity: O(1) for all functions
     * Space Complexity: O(1) for all functions
     */
  
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
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
        
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode temp = new StackNode(data);
        if(isEmpty()) {
            root = temp;
        } else {
            StackNode temp2 = root;
            root = temp;
            temp.next = temp2;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty()) {
            throw new java.lang.RuntimeException("Stack Underflow");
        }
        StackNode temp = root.next;
        int popped = root.data;
        root = temp;
        return popped;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            throw new java.lang.RuntimeException("Stack Underflow")
        }
        return root.data;
    } 
  
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
