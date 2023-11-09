
public class StackAsLinkedList {

	StackNode root; 
	// Time Complexity
   //  push -- O(n)
   //  pop --O(n)
   //  peek --O(n)
   // Space Complexity
   // O(n)
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data=data;
        	this.next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if(root==null) {
    		return true;
    	}
    	return false;
    	
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode tempNode = new StackNode(data);
    	if(root==null) {
    		root=tempNode;
    	}else  {
    		StackNode temp = root;
    		while(temp.next!=null) {
    			temp=temp.next;
    		}
    		temp.next=tempNode;
    	}
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	int x;
    	if(root==null) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else if(root.next!=null) {
    		StackNode temp=root;
    		while(temp.next.next!=null) {
    			temp=temp.next;
    		}
    		x=temp.next.data;
    		temp.next=null;
    		return x;
    	}else {
    		x=root.data;
    		root=null;
    		return x;
    	}
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root==null) {
    		return -1;
    	}
    	StackNode temp = root;
		while(temp.next!=null) {
			temp=temp.next;
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
  
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 
         
    } 

}
