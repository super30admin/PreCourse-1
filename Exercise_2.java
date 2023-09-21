public class StackAsLinkedList { 
	// Time Complexity : O(1)
	// Space Complexity :  O(1)
    StackNode root;  //Initializing the root node
  
    static class StackNode { 
        int data;  //Variable to store data
        StackNode next; //Node to save the address of the next node or pointing to the next node
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data=data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if(root==null) {
    		return true;
    	}
    	else {
    		return false;
    	}
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode node=new StackNode(data); //Initializing a new node;
    	if (root==null) { // Checking if stack is empty and assigning root node equals new node
            root = node;
        } else { 
            node.next = root; //If Stack is not empty 
            root = node; 
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else { // If stack is not empty, return the data in the root node and change root node
                 // to point to root node's next pointer
            int d = root.data;
            root = root.next;
            return d;

        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return root.data;

        }
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
