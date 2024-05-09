public class Exercise_2 { 
  //Linked list from the front
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
            this.next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return (root==null) ;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode= new StackNode(data);
        if(root==null)
        {
            root=newNode;
        }
        else{
           StackNode temp=root;
           newNode.next=temp;
              root=newNode;
           
        
        }

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(isEmpty())
    { System.out.println("Stack Underflow"); 
        return -1;
    }
        //Write code to pop the topmost element of stack.
	//Also return the popped element
    int poped=root.data;
    root=root.next;
    return poped;
    

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty())
        {
return root.data;
        }
        else{
            return -1;
        }
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
    } 
} 
