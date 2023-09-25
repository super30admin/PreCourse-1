/* Time Complexity :
 * 	initializing the stack, push, pop, peek, and isEmpty - O(1)
 * */

/* Space Complexity :
 * 	initializing the stack, push, pop, peek, and isEmpty - O(1)
 * */
// Did this code successfully run on Leetcode : -
// Any problem you faced while coding this : -


public class Exercise_2 { 
  
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
    	/*If root is equal to null, then return true,
    	 * else false
    	 */
    	return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	/*	1. Create a new node with the input data
    	 *	2. If stack is empty, then assign the newly created node to root
    	 *		else, the newNode becomes the new root and points/links to the old root */
    	StackNode newNode = new StackNode(data);
    	
    	if(isEmpty()) {
    		root = newNode;
    	}else {
    		StackNode tempNode = root;
    		root = newNode;
    		newNode.next = tempNode;
    	}
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	/*	If stack is empty, then return 0
    	 *	else, return the root data and modify next node as the root.*/
    	int poppedValue;
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		poppedValue = root.data;
    		root = root.next;
    		return poppedValue;
    	}
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	/*	If stack is empty, then return 0
    	 *	else, return the root data */
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		return root.data;
    	}
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
        
        System.out.println(sll.pop() + " Popped from stack");
        System.out.println("Top element is " + sll.peek());
        
        sll.push(25);
        System.out.println("Stack is empty - " + sll.isEmpty());
        
        System.out.println(sll.pop() + " Popped from stack");
        System.out.println(sll.pop() + " Popped from stack");
        
        System.out.println("Top element is " + sll.peek());
        System.out.println("Stack is empty - " + sll.isEmpty());
        System.out.println(sll.pop() + " Popped from stack");
        
        sll.push(22);
        System.out.println("Top element is " + sll.peek());
        System.out.println("Stack is empty - " + sll.isEmpty());
    } 
} 
