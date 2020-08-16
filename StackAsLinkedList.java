public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor with the current node with the data passed and making the next as null
        	this.data = data;
        	this.next = null;
        } 
    }   
	
    public boolean isEmpty() 
    { 
    	//If root is null then it will return true since the there are no node in the linkedlist
    	if(root == null) {
    		System.out.println("Stack is Empty");
    		return true;
    	}
    	return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	StackNode temp = new StackNode(data);
    	if(root == null) {
    		root = temp;
    	}
    	else {
    		StackNode temp2 = root;
	    	root = temp;
	    	temp.next = temp2;
    	}
    } 
  
    public int pop() 
    { 
    	if(root == null) {
    		System.out.println("Stack is Empty");
    		return 0;
    	}
    	else {
    		int temp = root.data;
    		root = root.next;
    		return temp;
    	}
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(isEmpty()) {
    		return Integer.MIN_VALUE;
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
