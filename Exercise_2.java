// Time Complexity: O(1) for push, pop, peek, isEmpty
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : No - compiled and ran locally
class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    {
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    } 
  
    public int pop() 
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
	    //If Stack Empty Return 0 and print "Stack Underflow"
        // code to pop the topmost element of stack.
        int value = root.data;
        root = root.next;
        //Also return the popped element
        return value;
    } 
  
    public int peek() 
    { 
        // code to just return the topmost element without removing it.
        if(isEmpty()){
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
