// Exercise 2:
// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Code along with comments explaining my approach:

public class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor
            StackNode root = null;
            data = 0; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //If stack is empty return true else return false
        if(root == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
  
    public void push(int data) 
    {   
        //Pushing new item to the stack
        StackNode temp = root;
        root = new StackNode(data);
        root.data = data;
        root.next = temp;
        System.out.println("Item pushed successfully!!");
    } 
  
    public int pop() 
    {
        int data;
        //Checking for stack overflow
        if(isEmpty())
        {
            System.out.println("Stack overflow alert!!");
            return 0;
        }
        else
        {
            //Popping the topmost element of stack
            data = root.data;
            root = root.next;
            //Returning the top element
            return data;
        }

    } 
  
    public int peek() 
    {   
        //Checking stack overflow 
        if(isEmpty())
        {
            System.out.println("Stack overflow alert!!");
            return 0;
        }
        //Returning the topmost element without removing it.
        else
        {
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
