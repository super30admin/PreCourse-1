// Space Complexity: O(n)
// Time Complexity:
// Push: O(1) (for adding to the end) and O(n) (for adding to the end with traversal)
// Pop: O(n)
// Peek: O(n)
// isEmpty: O(1)

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
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	StackNode temp = root;
    	if(temp == null) {
    		return true;
    	}
    	return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode temp = root;
    	StackNode newNode = new StackNode(data);
    	if(root == null) {
    		root = newNode;
    	}
    	else {
    		while(temp.next != null) {
    			temp = temp.next;
    		}
    		temp.next = newNode;
    	}
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if (this.isEmpty()){
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	StackNode temp = root;
    	while(temp.next.next != null) {
    		temp = temp.next;
    	}
    	 int poppedData = temp.next.data;
    	 temp.next = null;

    	 return poppedData;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	StackNode temp = root;
    	while(temp.next != null) {
    		temp = temp.next;
    	}
    	return temp.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        //System.out.println(sll.peek() + " peeking"); 
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.isEmpty());
    } 
}