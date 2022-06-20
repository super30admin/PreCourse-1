//Time complexity: O(1)
//Space complexity : O(n)
//Successfully executed on leetcode


public class StackAsLinkedList { 
  
    StackNode root; 
    StackNode node;
    StackNode temp;
    int count = 0;
    
  
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
        //Write your code here for the condition if stack is empty. 
        //StackNode node;
        if(node == null)
            return true;
        else
            return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newnode = new StackNode(data);
        
            newnode.next = node;
            node = newnode;
            count++;
            System.out.println(newnode.data);
    
        
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        int top_data;
        
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            
            temp = node;
            node = node.next;
            return temp.data;
            
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            return node.data;
        }
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
