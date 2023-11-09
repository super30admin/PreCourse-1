// Time Complexity :O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes in eclipse
// Any problem you faced while coding this : No
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
        if(root==null)
            return true;
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if(root == null)
        root=newNode;
        else{
           newNode.next=root;   // Make the new element as root so acts as top
           root=newNode;
    }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(isEmpty())
    {
        System.out.println("Stack Underflow");
        return 0;
    }
    else{
        int  temp = root.data;       // remove the root by making the next element as root
        root = root.next;
        return temp;  
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
         return -1;
        else{
            return root.data ;    // just return root data 
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
