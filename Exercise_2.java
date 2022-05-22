import StackAsLinkedList.StackNode;

// Excercise_2 :
// Time Complexity : O(1)
// Space Complexity : O(1)

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data=data;
        	this.next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	return root==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode newnode=new StackNode(data);
    	newnode.next=null;
    	 if (root == null) {
             root = newnode;
         }
    	 newnode.next = root;
         root = newnode;
    } 
  
    public int pop() 
    { 	
    	if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // Write code to pop the topmost element of stack.
        int pop_Node = root.data;
        root = root.next;

        // Also return the popped element
        return pop_Node;
    	
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
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
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
