//Time Complexity : O(1)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : haven't tried
//Any problem you faced while coding this : On line 45 if I get newnode.next or root.next both gives same value, not sure why so?
//											I am little confused about this, it would be great if you could tell me why?


//Your code here along with comments explaining your approach : given with each method

class StackAsLinkedList { 
  
    StackNode root; 
    
    // Creating node 
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
        	this.data = data;
        	System.out.println("data: " + data);
        } 
    } 
    // create a node. If there is no node assign to root, it will be null so assign newnode to root
    // If root is not null then assign that root to temp node, now I can assign newnode to root and
    // then assign temp(previous root) back to newly assigned root to create a link
    public void push(int data) 
    { 
        StackNode newnode = new StackNode(data);
        
        if(root == null) {
        	root = newnode;
        } else {
        	StackNode temp = root;
        	root = newnode;
        	root.next = temp;
        }
        System.out.println(data + " pushed to linkedlist stack");
    }     
	
    // If root is null that means its empty, otherwise not empty
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if(root == null) {
    		return true;
    	}else {
    		return false;
    	}
    }   
    
    // Before popping or removing last node, check if root is null or not
    // If null return 0
    // If not null then print top node data and then assign next node to root to remove or pop last node
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(root == null) {
    		System.out.println("Popping Stack is empty");
    		return 0;
    	}else {
    		int popped = root.data;
    		root = root.next;
        	return popped;
    	}
    } 
  
    // If root is null that means its empty, otherwise print last node/ root node's data.
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root == null) {
    		System.out.println("Peeking Stack is empty");
    		return 0;
    	}else {
    		return root.data;
    	}
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
	    sll.peek();
	    sll.pop();
	    System.out.println("is stack empty: " + sll.isEmpty());
	    sll.push(10);
	    System.out.println("is stack empty: " + sll.isEmpty());
	    sll.push(20); 
	    sll.push(30);
	    System.out.println("peeking linkedlist stack: " + sll.peek());
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
 

