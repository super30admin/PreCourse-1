/*
Time Complexity => isEmpty: O(1), push: O(1), pop: O(1), peek: O(1)
Space Complexity => O(n)
This code runs successfully on Leetcode.
I did not face any problem while coding this.
*/
public class StackAsLinkedList { 
  
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
	return this.root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
	if(this.root == null){
		this.root = new StackNode(data);
	}else{
		StackNode newNode = new StackNode(data);
		newNode.next = this.root;
		this.root = newNode;
	}	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	if(this.root == null){
		System.out.println("Stack Underflow");
		return 0;
	}

	StackNode rv = this.root;
	StackNode newRoot = this.root.next;
	this.root = newRoot;
	return rv.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
	return this.root.data;
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
