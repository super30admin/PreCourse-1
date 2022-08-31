// Time Complexity : Worst case : O(MAX) 
// Space Complexity :Worst case : O(MAX)
// Did this code successfully run on Leetcode : It runs successfully on Eclipse
// Any problem you faced while coding this : Not much, other than checking for stack underflow

public class Exercise_2 { 
  
    StackNode root; 
//private class defining single node
    static class StackNode { 
        int data; 
        StackNode next; 
     // Initialised constructor  

        StackNode(int data) 
        { 
            //Constructor here 
        	this.data = data;
        	this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //checks for the condition if stack is empty. 
    	return root == null;
    } 
  
    public void push(int data) 
    { 
        //code to push data to the stack. 
    	StackNode temp = new  StackNode(data);
    	temp.next = root;
    	root = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	if (root == null) {
            System.out.print("\nStack Underflow");
            return  0;
        }
    	//code to pop the topmost element of stack.
    	int popEle = root.data;
        // update the top pointer to point to the next node
        root = (root).next;
      //return the popped element 
        return popEle;
    } 
  
    public int peek() 
    { 
        // code to just return the topmost element without removing it.
    	if(!isEmpty())
    		return root.data;
    	else
    	{
    		System.out.println("Stack is empty");
    		return -1;
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
