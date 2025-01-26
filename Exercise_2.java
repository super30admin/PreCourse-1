// Time Complexity : All operations O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : I did not find this question on leetcode
// Any problem you faced while coding this : No


// Code here along with comments explaining your approach


public class Exercise_2 { 
  //node that is head of the list
    StackNode root; 
  
    //class that defines node
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data=data;
        } 
    } 
    
    
    /*
     * Checks if the head is null then return empty as true, else false.
     */
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
	if(root==null) {
	    return true;
	}else {
	    return false;
	}
    } 
    
    /*
     * Create a new node. Adds the data to the new node. Insert new node at the start of linkedlist.
     */
    public void push(int data) 
    { 
        //Write code to push data to the stack.
	StackNode node=new StackNode(data);
	node.next=root;
	root=node;
	
    } 
    
    /*
     * Check if the the list is empty, if not then find the data in first node, then make next node as first node.
     * Remove the first node.
     */
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	if(isEmpty()) {
	    System.out.println("Stack Underflow");
	    return 0;
	}
	int topval = peek();
	if(topval!=0) {
	    StackNode nextnode=root.next;
	    root.next=null;
	    root=nextnode;
	}
	return topval;
    } 
    
    /*
     * If list is not empty, return data in the first node.
     */
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
	if(isEmpty()) {
	    System.out.println(" Stack Underflow");
	    return 0;
	}
	return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
