// Time Complexity : push is 0(1),pop is o(n) cause for last element we need to iterate all the elements.
// Space Complexity :12+12 for three integers variable.
// Did this code successfully run on Leetcode :no,getting o is popped
// Any problem you faced while coding this :yes regarding push or pop getting 0 is popped.

public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode n1=new StackNode(data);
        n1.next=root;
        root=n1;
    
        
        
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        return peek();
            
        }
     
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        while(root.next!=null){
            root=root.next;
            
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