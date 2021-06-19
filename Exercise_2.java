public class StackAsLinkedList { 
  
    StackNode root;
  
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
        if(root ==  null)
        {
            return true;
        }
        else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode d = new StackNode(data);
        if(root == null)
        {
            root = d;
        }
        else{
            StackNode copy = root;
            while(copy.next!= null)
            {
                copy = copy.next;
            }
            
            copy.next = d;
        }
        
    } 
  
    public int pop() 
    { 	
        int result =0;
        
        StackNode copy = root;
        
        if(copy == null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else if(copy.next == null)
        {
            result = copy.data;
            copy = null;
            return result;
        }

        else{
            while(copy.next.next!= null)
            {
                copy = copy.next;
            }
            result = copy.next.data;
            copy.next = null;
        }
        return result; 

        
	//If Stack Empty Return 0 and print "Stack Underflow"
       

        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        StackNode copy = root;
        if(copy == null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else if(copy.next == null)
        {
            return copy.data;
        }
        else{
            while(copy.next.next!=null)
            {
                copy = copy.next;
            }
            return copy.next.data;
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
