// Time Complexity :O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : I didn't find this on Leetcode so successfully run it on eclipse.
// Any problem you faced while coding this : NO
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            // Initialise data and next
            data=data;
            next=null;

        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root==null)
          return true;
        return false;
    }   
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        // create a newNode object and assigning the newNode next to root and then finally assigning the newNode as root
        StackNode newNode = new StackNode(data);
        newNode.next=root;
        root=newNode;
        
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
       if(root==null){
           System.out.println("Stack Underflow");
           return 0;
       }
       int val= root.data;
       root=root.next;
       return val;


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
