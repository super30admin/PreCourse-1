// Time Complexity : O(n)
// Space Complexity : O(n)

public class StackAsLinkedList { 
  
    StackNode root; 
  
    /*
     * setting up constructor with data that passed as argument and next node setup
     * as null
     */
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            
        	this.data = data;
        	this.next = null;
        } 
    } 
    
    /*
     * if first node of linkedlist is null then we know for sure that it is stack is empty
     * if that first node ROOT is not empty then stack have some node
     */
	
    public boolean isEmpty() 
    { 
    	if(root == null) {
    		return true;
    	} else {
    		return false;
    	}
    } 
  
    /* checking if root node is null then we can start stack by assigning new node as root node
     * if stack already have some values then we we need to find last node into linked list and then assigne new node to that last node's next
     * position
     * 
     */
    public void push(int data) 
    { 
    	StackNode temp = this.root;
    	StackNode node=new StackNode(data);
    	if(this.root == null) {
    		this.root = node;
    	} else {
    		while(temp.next != null) {
        		temp = temp.next;
        	}
        	temp.next = node;
    	}
    	
    } 
  
    /*
     * to remove element from stack we need to check if stack is already empty then print error message
     * otherwise iterate on linked list then find last node and delete that last node from linked list 
     */
    public int pop() 
    { 	
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	} else {
    		StackNode prev = this.root;
    		
    		int x;
    		if(prev.next != null) {
    			
        		while(prev.next.next != null) {
        			prev = prev.next;
        		}
        		x= prev.next.data;
        		prev.next = null;
        		
    		} else {
    			x = prev.data;
        		this.root = null;
        		
    		}
    		return x;
    	}
    } 
  
    /*
     * to get top most element from stack , in linked list need to go to last node of linked list and return it's value
     * 
     */
    public int peek() 
    { 
        if(this.root == null) {
        	System.out.println("Stack is empty");
        	return 0;
        } 
    	StackNode temp = this.root;
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
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
