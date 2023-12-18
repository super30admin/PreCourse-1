// Time complexity : push : O(1), pop : O(1), peek : O(1), isEmpty : O(1)

public class StackAsLinkedList { 
  
    StackNode root = null; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
			this.data = data;
			next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
		
		if(root == null) return true;
		
		return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
		
		StackNode temp = new StackNode(data);
		temp.next = root;
		
		root = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			return 0;
		}
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
		
		int data = root.data;
		root = root.next;
		
		return data;
    } 
  
    public int peek() 
    { 
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			return 0;
		}
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