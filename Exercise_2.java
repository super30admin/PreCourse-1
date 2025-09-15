

//time complexity push operation: O(1) / space O(1)
//time complexity pop operation: O(1) / space O(1)
//time complexity peek operation: O(1) / space O(1)
//time complexity isEmpty operation: O(1) / space O(1)
public class StackAsLinkedList { 
	  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  //constructor initalized with data
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data=data;
        	this.next=null;
        	
        } 
    } 
    
	//if node root is null, stack empty true else false
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if(root==null) {
    		return true;
    	}
    	return false;
    } 
  
    //at the root, adding new node pointing newNode.next as root element 
    public void push(int data) 
    { 
    	StackNode newNode = new StackNode(data);
    	newNode.next=root; // use root as pointer to stack top
    	root = newNode;
    	
    	System.out.println(data + " pushed to stack");
    } 
  
    //check if stack empty and then return 0 else get root.data and update root -> root.next and return it
    public int pop() 
    { 	
    	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    	//Also return the popped element 
    	if(root == null) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	int popEl = root.data;
    	root=root.next; // update the top pointer
    	return popEl;

    } 
  
    //check stack empty using root null chek else return root.data
    public int peek() 
    //Write code to just return the topmost element without removing it.
    { 
    	if(root == null) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	return root.data;
    	
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        //System.out.println(sll.peek() + " peek from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
        //added line for stack empty check
        System.out.println(" stack empty " + sll.isEmpty());
    } 
} 

