public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;

        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root == null)
        {
            return true;
        }
        else 
        return false;

    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 

        StackNode temp = new StackNode(data);
        if(temp!= null)
        {
            temp.data = data;
            temp.next = root ;
            root = temp;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        int x;
    if(root != null)
    {
        x = root.data;
        root = root.next;
        
    }
    else 
    x = 0;
    return x;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty())
        {
            return root.data;
        }
        else 
        return -1;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
