class StackAsLinkedList { 
  
    StackNode root; 
  StackNode top=null;
  StackAsLinkedList() { this.top = null; }
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { this.data=data;
        
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return(root==null);  
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        
       StackNode temp = new StackNode(data);
       temp.next = top;
  
        // update top reference
        top = temp;
            
      
    }
    
  
    public int pop() 
    { 	
        if(top==null) System.out.println("UnderFlow");
        int pop=top.data;
        top=top.next;
        return pop;
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 

    {   if(top==null) System.out.println("UnderFlow");
        return top.data;
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
