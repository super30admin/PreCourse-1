//Time complexity O(1)
//Space complexity O(n)

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
    }
  	StackNode top;
        StackAsLinkedList() 
        { 
            //Constructor here 
		this.top = null;
        } 
  
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
	    return top == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
	    StackNode temp = new StackNode();
	    if(temp == null){
		    System.out.println("Stack Overflow");
		    return;
	    }else{
		    temp.data = data;
		    temp.next = top;
		    top = temp;
	    }
		    
		    
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	    
	    if(isEmpty()){
		    System.out.println("Stack is Empty");
	    }
int result = top.data;
	    top = top.next;
	    return result;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
	    if(isEmpty()){
		    System.out.println("Stack is empty");
		    return -1;
	    }else{
		  return top.data;
	    }
	    
    } 

	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " " + "popped from stack\n"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
}
