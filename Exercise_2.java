// was not running without changing the the file name as StackAsLinkedList was declared public, so changed the file name while running in eclipse
/*Time Complexity
 * Worst Case
 * Push O(1)
 * Pop O(n)
 * Peek O(1)
 * Space Complexity
 * LinkedList O(n)
 */
public class StackAsLinkedList { 
  
    StackNode root; 
    StackNode Last=root;
 
 
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            
        	this.data=data;
        	this.next=null;
        } 
    } 
    

    
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if(root.equals(null)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	if(root==null) {
    		root=new StackNode(data);
    		Last=root;
    	}else {
    		Last.next=new StackNode(data);
    		Last=Last.next;
    	}
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    if(isEmpty()) {
    	System.out.println("Stack Underflow");
    	return 0;
    }
    else {
    	   StackNode current=root;
    	   StackNode previous=null;
    	   int count=0,data=0;
    	   if(Last.equals(root)) {
    		   data=Last.data;
    		   Last=null;
    		   root=null;
    		   return data;
    	   }
    	   while(true){
    		   count++;
    		   previous=current;
               current=current.next;
               if(current.next==null) {
            	   break;
               }
    	   }
    		   data=current.data;
    		   Last=previous;
    		   previous.next=null;
    	   return data;
    }
	//Also return the popped element 
    
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	return Last.data;
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
