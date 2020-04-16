package s30;

public class StackAsLinkedList { 
	  
	// considering root as a top here
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
    
	// Time complexity is O(1)
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
    } 
  
    // Time complexity is O(1)
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode temp = new StackNode(data);
        temp.next = root;
        root = temp;
    } 
  
    // Time complexity is O(1)
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }else{
        	int t = root.data;
            root = root.next;
            return t;
        }
    } 
  
    // Time complexity is O(1)
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root != null)
    		return root.data;
    	else
    		return 0;
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
