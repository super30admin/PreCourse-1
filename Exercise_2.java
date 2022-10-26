// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this :    No
public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
        
        StackNode(int data) 
        {   
            //assign the value of data to data part of the node
            this.data=data;
            //point next of node to null
            this.next=null; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //if root is null means that the stack is empty 
        if(root==null) return true;     
        return false;       

    } 
  
    public void push(int data) 
    { 
        
        StackNode newnode=new StackNode(data);
        
        //make the next of newnode point to root 
        newnode.next=root;  
        //make new node as the root
        root=newnode;
    } 
  
    public int pop() 
    { 	
        //if stack is empty return 0
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        } 

        //else pop the element and return
        
        StackNode topnode=root;
        //make the root point to its next element
        //thus deleting the curr element to which root is pointing to
        root=root.next;
        
        return topnode.data;    
    } 
  
    public int peek() 
    { 
        //if stack is empty return 0
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        } 
        //return the value of the top elemet of the stack
        return root.data;
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
