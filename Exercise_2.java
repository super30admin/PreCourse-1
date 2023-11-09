// Time complexity : O(1)
// Space complexity : O(N)
// Did this code successfully run on Leetcode : YES  (https://leetcode.com/problems/valid-parentheses)
// Any problem you faced while coding this : NO
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
        if(root==null){
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode new_node=new StackNode(data);
        new_node.next=root;
        root=new_node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(root==null){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        else{
            int x=root.data;
            root=root.next;
            return x;
        }
        
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root==null){
            return 0;
        }
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
