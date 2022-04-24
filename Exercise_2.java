// Time Complexity : O(1) for isEmpty(),push(),pop(),peek()
// Space Complexity : O(N)
 class StackAsLinkedList {
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
        return root==null?true:false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
        if(root==null)
        {
            root=node;
        }
        else
        {
            StackNode tmp = root;
            root = node;
            node.next = tmp;
        }


    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
      int top = 0;
      if(root==null)
      {
          System.out.println("Stack Underflow");
          return 0;
      }
      else
      {
         top = root.data;
         root = root.next;

      }
      return top;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty())
        { 
            return root.data;
        }
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