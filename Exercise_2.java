// Time Complexity :
// Space Complexity :
//Push - TC - O(1) SC - O(1)
//Peek - TC - O(1) SC - O(1)
//Pop - TC - O(1) SC - O(1)
// Did this code successfully run on Leetcode : not found on leetcode
// Any problem you faced while coding this : Yes, figuring out the part on how to handle the root scenario. Also - adding to the start of the LL not the end


class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            this.data = data;
            this.next = null;
            //Constructor here 
        } 
    }
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return root == null;
    } 
  
    public void push(int data) 
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        int tmp = root.data;
        root = root.next;
        return tmp;
    } 
  
    public int peek() 
    {
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        return root.data;
        //Write code to just return the topmost element without removing it.
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
