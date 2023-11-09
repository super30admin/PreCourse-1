public class StackAsLinkedList { 
  //time complexity - O(1)
  //Space complexity - O(N), N - size of stack
  //Don't find this problem in leetcode

    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //If root is null, it means no element exists in Stack so returns true. Otherwise stack is not empty
        return root ==null;
    } 
  
    public void push(int data) 
    { 
        //create Stacknode with given data and make it first element in the StackNode with below logic.It will help to easy the implementation of pop and peek functionalities
        StackNode temp = new StackNode(data);
        temp.data= data;
        temp.next = root;
        root=temp;
} 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
    	if(root==null){
    	    System.out.print("Stack Underflow");
    	    return 0;
    	}
    	int result= root.data;
    	root = root.next;
    	return result;
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