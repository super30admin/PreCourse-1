class StackAsLinkedList {

    // Time Complexity : O(1) for all methods
    // Space Complexity : O(n) where n is the size of stack or n is the number of nodes in linked list
    // Any problem you faced while coding this : For some reason, the code gave an error on the class name, so had to
    // remove the public parameter
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
            this.next = null;
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
        StackNode new_node = new StackNode(data);
        new_node.next = root;
        root = new_node;
    } 
  
    public int pop() 
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        int popped_element = root.data;
        root = root.next;
        return popped_element;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
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
