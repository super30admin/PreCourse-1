// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

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
        //Write your code here for the condition if stack is empty. 
        if(root == null){
            return false;
        }
         else{
            return true;
         } 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 

        StackNode node =  New StackNode(data);
        if(root == null){
            root = node;
        }
        else{
            StackNode temp = root;
            root = node;
            root.next = temp;
        }
       
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }else{
           int temp = root.data;
           root=root.next;
           return temp;
        }
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null ){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int temp = root.data
            return temp;
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
