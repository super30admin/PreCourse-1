// Time Complexity : O(1) for all operations (Since done at the root/head)
// Space Complexity : O(n), n is the number of nodes in the list
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : N/A

public class StackAsLinkedList { 
  
    StackNode root; 

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
        //Condition for stack is empty
        return root == null;
    } 
  
    public void push(int data) 
    { 
        StackNode node = new StackNode(data); //Creating a new node with the data given
        node.next = root;                     //linking the new node to root
        root = node;                          //updating the root   
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(root==null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }else
        {
            StackNode x = root;   //storing root in a temporary node
            root = root.next;     //moving root to the next node
            return x.data;        //returning data from temporary node
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty())
        {
            return root.data;
        }else
            return -1;
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