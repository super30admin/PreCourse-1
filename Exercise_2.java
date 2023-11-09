// Time Complexity : O(1) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this:  Had to go through study materials online for correcting the syntax 
// Your code here along with comments explaining your approach: For pushing the data, first we check if the root is null, if it is we assign the data to it, or else the root is updated to point to Node2 and Node 2 becomes the new top node of the stack. For Pop, the data is returned and root is updated with the next value.

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if (root==null)
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
        //Write code to push data to the stack. 
        StackNode Node2=new StackNode(data);

        if(root==null){
            root=Node2;
        }
        else{
            StackNode temp=root;
            root=Node2;
            Node2.next=temp;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    int numberPopped=Integer.MIN_VALUE;
    if(root==null)
    {
        System.out.println("Stack Underflow");
        return 0;
    }
    else
    {
        numberPopped=root.data;
        root=root.next;
    }
    return numberPopped;

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root==null)
    {
        return 0;
    }

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
