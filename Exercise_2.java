// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : While running on Visual Studio I had to rename class name same as file name.


// Your code here along with comments explaining your approach : Each new node becomes the root and stores the previous node in the next field.



public class Exercise_2 { 
  
    StackNode root = null; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return (root == null);
        
    } 
  
    public void push(int data) 
    { 
        StackNode node = new StackNode(data);
        if(isEmpty()){
            root = node;
            node.next = null;
        }else{
            node.next = root;
            root = node;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int data = root.data;
            root = root.next;
            return data;
        }

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            return root.data;
            
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
