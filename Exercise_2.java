// Time Complexity : all isEmpty, push, pop, peek are O(1), pop at tail node O(n)
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;    //newly created node doesn't hold memory address of any other nodes so make next is null.
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    {  
        return (root == null);  
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);  // craete new node with input data
        newNode.next = root;                      // make new node next poniting to the root
        root = newNode;                           // point root to the new node
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty()) {
           System.out.println("Stack Underflow");   //if empty stack return true
           return 0;
        }
        int popedElement = root.data;              
        root = root.next;
        return popedElement;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
           System.out.println("Stack Underflow");
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
