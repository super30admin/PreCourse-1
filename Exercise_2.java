
/*
 * Time Complexity :O(1)
 * All the Methods in this class has Time Complexity O(1).
 * Space Complexity : O(N) N is number of elemnts inserted into the stack.
 * Did this code successfully run on Leetcode : Didn't see this problem on Leetcode and hence solve locally.
 * Any problem you faced while coding this : NO
 * 
 */
public class Exercise_2 { 
  
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
    	//Check if the LinkedList is empty or not, if root is null then it's empty and has space/memory tostore new values/Node
    	if(root == null)
    		return true;
    	return false;
    		
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	//Created a new Node and basically put that new node before the root and made the newnode as root.
    	StackNode newNode = new StackNode(data);
    	
		newNode.next=root;
        root=newNode;
    	
    } 
  
    public int pop() 
    { 	
    	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    	//Also return the popped element 
    	//Checked if Stack is Empty and if it is not then popped the top element by storing top Node data into Value variable.
    	//change the pointer of root to it's next Node and returned the value variable
    	if(isEmpty()){
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	int value = root.data;
    	root = root.next;
    	return value;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	//checked if stack is Empty and if it is not then returned the root's data because root is the top element here.
    	if(isEmpty()){
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	
    	return  root.data;
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
