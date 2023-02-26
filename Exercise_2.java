/*
Time complexity - O(1)
Space Complexity - O(N) where N is the size of the stack.
*/
class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) { 
            //Constructor here
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() { 
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
	    if(isEmpty()){
	        System.out.println("Stack underflow");
	        return 0;
	    }
	    int temp = root.data;
	    root = root.next;
	    return temp;
    } 
  
    public int peek() { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
	        System.out.println("Stack empty");
	        return -1;
	    }
	    return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) { 
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        
        System.out.println("Top element is " + sll.peek()); 
        
        
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
        
        System.out.println(sll.pop() + " popped from stack"); 
        
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
