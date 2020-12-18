// Time Complexity : O(1)
// Space Complexity : O(n) where n is max size of stack
// Did this code successfully run on Leetcode : Did not find it in leetcode
// Any problem you faced while coding this :
// File name was not same as class name but class was made public. This resulted in error.


// Your code here along with comments explaining your approach
// root will point to head of stack
// everytime we add something to stack we put new node as root previous head as next of root
// everytime we remove something from stack we change root to root.next





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
        if(root == null) return true;
        return false;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    {
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int data = root.data;
        root = root.next;
        return data;
    } 
  
    public int peek() 
    {
        if(root == null) return 0;
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
