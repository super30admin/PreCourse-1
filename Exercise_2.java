// Time Complexity : O(N) where N is size of the stack
// Space Complexity : O(N) where N is size of the stack
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// as stack is First In Last Out, we will add the elements to the end of list and remove the elements from the end of the list
class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
        
        //initialize node with data
        StackNode(int data) 
        { 
        	this.data=data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
    	//check for root node if it is null
    	if(root==null) {
    		return true;
    	}else {
    		return false;
    	}
    } 
  
    public void push(int data) 
    { 
    	StackNode node=new StackNode(data);
    	//check if root node is null and if it is make the new node as root
    	if(isEmpty()) {
    		root=node;
    		root.next=null;
    	}else {
    		//traverse through the linked list and link the new node at the end of the list
    		StackNode curr=root;
    		while(curr.next!=null) {
    			curr=curr.next;
    		}
    		curr.next=node;
    		//as this is the last node point the next to null
    		node.next=null;
    	}
    } 
  
    public int pop() 
    { 	
    	//check if the stack is empty and if it is print appropriate message
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	//traverse through the linked list until the last but one node 
    	StackNode curr=root;
		while(curr.next!=null && curr.next.next!=null) {
			curr=curr.next;
		}
		//assign the last node to a temp node
		int result=curr.next.data;
		// point the last but one node's next to null hearby removing the last node from the linked list  
		curr.next=null;
		return result;
    } 
  
    public int peek() 
    { 
    	//check if stack is empty and if it is return 0
    	if(isEmpty()) return 0;
    	StackNode curr=root;
    	//traverse through the linked list until the last node and return the last node's data
		while(curr.next!=null) {
			curr=curr.next;
		}
		int result=curr.data;
		return result;
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
