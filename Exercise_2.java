import java.util.*;

public class Exercise_2 { 
	  
    StackNode root; 
  
    class StackNode {
        int data; 
        StackNode next;
  
        StackNode(int val) 
        { 
            //Constructor here \
        	this.data = val;
        	this.next = null;
        } 
    
    }
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	return (root == null) ? true :false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode newNode = new StackNode(data);
    	newNode.next = root;
    	root = newNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(root != null) {
    	int val = root.data;
    	root = root.next;
    	return val;
    	}
    	else {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root != null) {
        	int val = root.data;
        	return val;
        	}
        	else {
        		System.out.println("Stack Underflow");
        		return 0;
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
    } 
} 
