public class StackAsLinkedList { 
  
     Node head;
   class Node{
	   int value;
	   Node next;
   }
        StackNode() 
        { 
            head =null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
         if(head==null)
         {
         	System.out.println("Stack is Empty");
         	return true;
         }
         
		return false; 
    } 
  
    public void push(int data) 
    { 
      Node extraHead = head;
        head = new Node();
        head.value = data;
        head.next = extraHead;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(head==null)
        {
        	System.out.println("Stack Underflow");
        	return 0;
        }
        
	//Also return the popped element 
        else
        {
		int x= head.value;
        	head = head.next;
        	return x;
        }
    } 
  
    public int peek() 
    { 
        if(head==null)
    	{
    		System.out.println("Stack Underflow : ");
    		return 0;
    	}
       int x= head.value;
       return x;
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
