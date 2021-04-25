
// Time Complexity : O(1)
// Space Complexity :  O(n), n-> no of elements in stack
// Any problem you faced while coding this : creating many unnnecesary variables, 

class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode prev; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data; 

        } 
    } 
    
    StackNode top = root;
	
    public boolean isEmpty() 
    { 
        if(top==root)//means no elements added
        {
            return true;
        }
        else    
        return false;
    } 
  
    public void push(int data) 
    { 
        StackNode n = new StackNode(data); 
        n.prev = top;
        top = n;       

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(!isEmpty())
        {
            int val = top.data;
            top = top.prev;
            return val;        //return the popped element    
        }
        else{
            System.out.println("Stack Underflow");
            return 0;
        }
       
    } 
  
    public int peek() 
    { 
            return top.data;       //return the popped element            
            //assuming peek done when stack non empty, hence no other checkd needed
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack");   
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
