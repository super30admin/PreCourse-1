class StackAsLinkedList {
   //Time complexity: O(1) for push, pop and peek operations
  //Space complexity: O(n) as the stack grows   
  
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
        if(root == null)
        {
            return true;
        }

        return false;
        
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);

        if(root == null)
        {
            root = node;
        }

        else
        {
            node.next = root;
            root = node;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

    if(root == null)
    {
        System.out.println("Stack underflow");
        return 0;
    }

    else
    {   
        int x = root.data;
        root = root.next;
        return x;
    }
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
