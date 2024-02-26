// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

public class Exercise_2 { 
  
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
        if(root!=null)
        {
        StackNode node=new StackNode(data);
        node.next=root;
        root=node;
        }
        else{
        root = new StackNode(data);
        }
        
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(root==null)
    {
        System.out.println("Stack Underflow");
        return 0;

    }
    //Write code to pop the topmost element of stack.
	//Also return the popped element 
    int val=root.data;
    StackNode temp=root.next;
    root.next=null;
    root=temp;
    return val;
    
    
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root==null)
        {
            return -1;
        }
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
